package com.springboot.college.controller;

import com.alibaba.fastjson.JSONObject;
import com.springboot.college.config.SysFtpConfig;
import com.springboot.college.dto.ReportDto;
import com.springboot.college.model.ImgsInfo;
import com.springboot.college.service.UploadFileService;
import com.springboot.college.util.RedisUtil;
import com.springboot.college.util.SftpUtil;
import com.springboot.college.util.excelupload.ObjectExcelRead;
import com.springboot.college.util.excelupload.UploadUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/**
 * @Description
 * @Date 2020/3/25 14:46
 * @Created by renjuanjuan
 */
@Api(tags = "文件上传")
@RestController
@RequestMapping("/uploadFile")
public class UploadFileController {


    @Autowired
    private UploadFileService uploadFileService;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    UploadUtil uploadUtil;

    @RequestMapping(value = "/uploadImgs", method = RequestMethod.POST)
    public void uploadImgs(HttpServletRequest request, HttpServletResponse response)  {
        JSONObject json = new JSONObject();
        json.put("ErrMsg", "图片上传失败!");
        json.put("RetCode", "1");
        json.put("imagId", "-1");
        json.put("RetUrl", "");
        try {
            // 先实例化一个文件解析器
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        ImgsInfo imgsInfo = null;
            // 判断request请求中是否有文件上传
        if (multipartResolver.isMultipart(request)) {
            // 转换request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            // 获得文件
            Iterator<String> iter = multiRequest.getFileNames();
            SysFtpConfig sysFtpConfig = JSONObject.parseObject(redisUtil.getFtpInfo(1L), SysFtpConfig.class);
            while (iter.hasNext()) {
                MultipartFile file = multiRequest.getFile(iter.next());
                if (file != null) {
                    SftpUtil sftp = new SftpUtil(sysFtpConfig);
                    sftp.connect();
                    String fileName = file.getOriginalFilename();
                    String imgType = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
                    String sysName = UUID.randomUUID().toString().replace("-", "").toLowerCase() + "." + imgType;
                    String imgPath = "portal_pic" + File.separator + "item" + File.separator;
                    String path = sysFtpConfig.getRootpath() + imgPath;
                    sftp.upload(path.replace("\\", "/"), sysName, file.getInputStream());
                    imgsInfo = new ImgsInfo();
                    imgsInfo.setName(fileName);
                    imgsInfo.setSysname(sysName);
                    imgsInfo.setImgsize(file.getSize() + "");
                    imgsInfo.setImgtype(imgType);
                    imgsInfo.setImgpath(imgPath.replace("\\", "/").replace("//", "/") + sysName);
                    imgsInfo.setDirectoryid(sysFtpConfig.getRootpath());
                    //使用图片服务保存图片信息
                    uploadFileService.save(imgsInfo);
                    // KindEditor 需要返回的信息 error = 0
                    json.put("ErrMsg", "");
                    json.put("RetCode", "0");
                    json.put("imagId", imgsInfo.getId());
                    json.put("RetUrl", sysFtpConfig.getOrigin() + imgsInfo.getImgpath());
                    sftp.disconnect();
                }
            }
        }
        printJson(response, json.toString());
        } catch (Exception e) {
            e.printStackTrace();
            try {
                json.put("RetCode", "1");
                printJson(response, json.toString());
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
    //操作结果
    protected void printJson(HttpServletResponse response, String json)
            throws IOException {
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write(json);
        response.getWriter().flush();
        response.getWriter().close();
    }

    /**
     * 上传excel并读取存入数据库,需求通过excel导入用户
     */
    @PostMapping(value = "/upExcel")
    public List<ReportDto> upExcel(MultipartFile excelFile){
        String excelPath = null;
        if (excelFile != null || !excelFile.isEmpty()){
            //上传excel，并返回excel最终路径
            try {
                excelPath = uploadUtil.uploadExcel(excelFile);
                //根据excel路径读取excel: 读EXCEL操作,读出的数据导入List 2:从第3行开始；0:从第A列开始；0:第0个sheet
//                @SuppressWarnings("rawtypes")
                List<ReportDto> listPd = (List) ObjectExcelRead.readExcel(excelPath, 2, 0, 0);
                if (listPd != null && listPd.size() > 0) {
                    return listPd;
                }
            }catch (Exception e){
                return null;
            }

        }
        return null;

    }


}
