package com.springboot.college.util.excelupload;

import com.springboot.college.common.CommonEnum;
import com.springboot.college.exception.UnsupportedException;
import com.springboot.college.util.Constants;
import com.springboot.college.util.UniqueUUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * @Description TODO
 * @Date 2020/1/4 23:58
 * @Created by zhuozuoying
 */
@Slf4j
@Component
public class UploadUtil {

    @Autowired
    UploadPathConfig uploadPathConfig;
    private static Random random = new Random();
    public static final String UPLOAD_RESOURCE = "uploadResource";

    /**
     *
     * @param fileOriginName
     * @return
     */
    public static String getFileName(String fileOriginName) {
        return UniqueUUID.randomUUID() + fileOriginName.substring(fileOriginName.lastIndexOf("."));
    }

    /**
     *
     * @param file
     * @param path
     * @return
     * @throws IOException
     */
    public static String uploadImg(MultipartFile file, String path) throws IOException {
        String fileOriginName = file.getOriginalFilename();
        String fileSuffix = fileOriginName.substring(fileOriginName.lastIndexOf(".") + 1).toLowerCase();
        List<String> imageType = new ArrayList<>(Arrays.asList(Constants.IMG_TYPE));
        if (!imageType.contains(fileSuffix)) {
            log.error("the picture's suffix is illegal");
            throw new UnsupportedException(CommonEnum.BODY_NOT_MATCH);
        }
        String fileName = getFileName(fileOriginName);
        String savePath = path + File.separator + "img" + File.separator + fileName;
        File f = new File(savePath);
        if (!f.getParentFile().exists()) {
            f.getParentFile().mkdirs();
        }
        file.transferTo(f);
        String routePath = File.separator + Constants.ROUTE_IMG + File.separator + fileName;
        return routePath;
    }
    /**
     *   上传Excel文件
     * @param file excel文件对象
     * @return 上传Excel的具体方法，返回excel的最终路径
     */
    public String uploadExcel(MultipartFile file) {
        //目标地址 = 上传路径 + 文件名
        String targetPath = null;
        String uploadType = "excel";
        if (file != null && !file.isEmpty()) {
            // 设置实际的上传路径: 基本路径/类型/日期/
            String basePath = uploadPathConfig.getUploadPath();
            String nowDate = DateUtil.getDays();
            String realPath = formatUploadPath(basePath, uploadType, nowDate);
            // 设置上传的文件名称: 格式化以避免文件名重复
            String fileName = file.getOriginalFilename();
            fileName = formatFileName(fileName);
            try {
                //开始上传
                uploadFile(file.getBytes(), realPath, fileName);
                // 上传成功后，返回最终的上传地址
                targetPath = getExcelPath(uploadType, nowDate, fileName);
            } catch (Exception e) {
                return null;
            }
        }
        return targetPath;
    }


    /**
     * @Description : 上传文件
     * @param file     : 上传的文件实体
     * @param filePath : 上传文件的目标路径
     * @param fileName : 文件名
     * @throws Exception
     */
    public void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath + fileName);
        out.write(file);
        out.flush();
        out.close();
    }
    /**
     * 设置上传路径：根据上传时间和上传类型设置
     */
    public static String formatUploadPath(String basePath, String type, String date) {
        String uploadPath = basePath + type + File.separator + date + File.separator;
        return uploadPath;
    }

    /**
     * 格式化文件名称, 避免文件名重复
     */
    public static String formatFileName(String fileName) {
        String prefix = fileName.getBytes().toString().substring(3);
        String midfix = new Date().getTime() + "";
        String random1 = random.nextInt(10) + "";
        String random2 = random.nextInt(10) + "";
        String suffix = fileName.replaceAll(".+(\\.\\w+)", "$1");
        String realName = prefix + midfix + random1 + random2 + suffix;
        return realName;
    }
    /**
     * 获取excel的位置, 即uploadSetting.properties中配置的路径 + excel + 日期 + excel名
     */
    public String getExcelPath(String type, String nowDate, String fileName) {
        return getUploadPath() + type + File.separator + nowDate + File.separator + fileName;
    }
    /**
     * 获取当前系统下配置的基本上传路径
     * @return
     */
    public String getUploadPath() {
        return uploadPathConfig.getUploadPath();
    }

}
