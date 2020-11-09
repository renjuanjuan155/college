package com.springboot.college.util;

import com.alibaba.fastjson.JSONObject;
import com.springboot.college.config.SysFtpConfig;
import com.springboot.college.model.ImgsInfo;
import com.springboot.college.service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by kinson on 2018/8/9.
 */
@Component("uploadUtilAdmin")
public class UploadUtilAdmin {
    @Autowired
    public UploadFileService imgsInfoService;
    @Autowired
    private RedisUtil redisBizUtilAdmin;

    public String uploadSmallImage(InputStream smallImage){
        SftpUtil sftp = null;
        String small_url = "";
        //获取ftp配置对象
        SysFtpConfig sysFtpConfig = JSONObject.parseObject(redisBizUtilAdmin.getFtpInfo(1L), SysFtpConfig.class);
        try {
            if(smallImage!=null){
                //获取图片基本信息,略缩图信息初始化
                String sysName_s = UUID.randomUUID().toString().replace("-", "").toLowerCase() + "_s.jpg";;
                String imgPath_s = "portal_pic" + File.separator + "small" + File.separator;
                String path_s = sysFtpConfig.getRootpath() + imgPath_s;

                //创建略缩图对象,设值保持
                ImgsInfo imgsInfo_s = new ImgsInfo();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
                imgsInfo_s.setName("略缩图_"+((int)(Math.random()*9+1)*10000)+"_"+sdf.format(new Date()));
                imgsInfo_s.setSysname(sysName_s);
                imgsInfo_s.setImgsize(smallImage.available() + "");
                imgsInfo_s.setImgtype("jpg");
                imgsInfo_s.setImgpath(imgPath_s.replace("\\", "/").replace("//", "/") + sysName_s);
                imgsInfo_s.setDirectoryid(sysFtpConfig.getRootpath());
                //使用图片服务保存图片信息
                imgsInfoService.save(imgsInfo_s);
                //打开sftp连接,并将略缩图上传到服务器
                sftp = new SftpUtil(sysFtpConfig);
                sftp.connect();
                sftp.upload(path_s.replace("\\", "/"), sysName_s, smallImage);
                //关闭连接
                sftp.disconnect();
                small_url = sysFtpConfig.getOrigin() + imgsInfo_s.getImgpath();
            }

            return small_url;
        } catch (Exception e) {
            small_url = "";
            e.printStackTrace();
        }
        return small_url;
    }



}
