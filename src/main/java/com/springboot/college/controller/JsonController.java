package com.springboot.college.controller;

import com.springboot.college.common.R;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @Description TODO
 * @Date 2020/4/3 17:43
 * @Created by zhuozuoying
 */
@RestController
@RequestMapping(value = "/json")
public class JsonController {

    @RequestMapping(value = "/covert",method = RequestMethod.POST)
    public R covert(String str){
        return R.success();
    }

    /*@PostMapping("/upload")
    public R upload(@RequestParam("photo")MultipartFile photo, HttpServletRequest request) {// 定义上传文件存放的路径
        String path = configProperties.getFileupload() + "uploadPhotos/";
        System.out.println(path);
        // 定义文件在上传路径中的文件夹名称
        File folder = new File(path);
        // 检测folder是否是文件夹，不是就创建
        if (!folder.isDirectory()) {
            folder.mkdirs();
        }
        try {
            // 获取文件的原始名称
            String photoName = photo.getOriginalFilename();
            // 文件保存操作
            photo.transferTo(new File(folder, photoName));
            // 访问的url
            String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
            String photoPath = basePath + configProperties.getStaticAccessPath().substring(0, configProperties.getStaticAccessPath().lastIndexOf("/") + 1) + "uploadPhotos/" + photoName ;
            System.out.println(basePath);
            System.out.println(photoPath );
            return R.success();
        } catch (IOException e) {
            return R.error("err");
        }
    }*/
    @PostMapping("/upload")
    public void uploadPhoto(@RequestParam("uploadFile")MultipartFile uploadFile, @RequestParam("aiIdCard")String aiIdCard, HttpServletRequest request) {
        //定义上传文件存放的路径
        String path = request.getSession().getServletContext().getRealPath("/usr/local/app/financial-statement/download/");//此处为tomcat下的路径，服务重启路径会变化
        System.out.println(path);
        //定义文件在上传路径中的文件夹名称
        File folder = new File(path + aiIdCard);
        //检测folder是否是文件夹，不是就创建
        if (!folder.isDirectory()) {
            folder.mkdirs();
        }
        //获取文件的原始名称
        String oldName = uploadFile.getOriginalFilename();
        //oldName.substring(oldName.lastIndexOf("."))   获取文件的后缀名
        //生成新的文件名（下面根据自己需要决定是否使用）
        //String newName ="定义新名字" + oldName.substring(oldName.lastIndexOf("."));
        //文件保存操作
        try {
            uploadFile.transferTo(new File(folder, oldName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //返回保存的url，根据url可以进行文件查看或者下载
        String filePath = request.getScheme() + "://" + request.getServerName() + ":" +request.getServerPort() + "/uploadFile/" + aiIdCard +"/"+ oldName;
        }

}
