package com.springboot.college.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;

/**
 * @Description
 * @Date 2020/4/1 16:20
 * @Created by zhuozuoying
 */
@Slf4j
@RestController
@RequestMapping("/down")
public class DownFileController {

    @Value("${spring.servlet.file.download.url}")
    private String downloadFilePath;

    @RequestMapping("/download")
    public String fileDownLoad(HttpServletResponse response, @RequestParam("fileName") String fileName) {
        File file = new File(downloadFilePath + '/' + fileName);
        if (!file.exists()) {
            return "下载文件不存在";
        }
        response.reset();// 必要地清除response中的缓存信息
        response.setContentType("application/octet-stream");
        response.setCharacterEncoding("utf-8");
        response.setContentLength((int) file.length());
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName);

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));) {
            byte[] buff = new byte[1024];
            OutputStream os = response.getOutputStream();
            int i = 0;
            while ((i = bis.read(buff)) != -1) {
                os.write(buff, 0, i);
                os.flush();
            }
        } catch (IOException e) {
            log.error("the picture's suffix is illegal");
            return "下载失败";
        }
        return "下载成功";
    }
    //下载第三方文件到服务器
    //上面是从服务器上下载文件，但是也有一些需求需要从其他地方下载文件到服务器上。所以这里提供一个下载文件到服务器的方法。
    public static boolean downloadFromUrl(String url, String fileName, String dir) {
        try {
            URL httpurl = new URL(url);
            System.out.println(fileName);
            File file = new File(dir + '/' + fileName);

            //目录不存在 则创建
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (file.exists()) {
                file.delete();
                log.info("文件重复，替换掉" + file.toPath().toString());
            }
            FileUtils.copyURLToFile(httpurl, file);
        } catch (Exception e) {
            log.error("{}", e);
            return false;
        }
        log.info("保存成功：" + dir + '/' + fileName);
        return true;
    }

}
