package com.springboot.college.controller;

import com.springboot.college.common.R;
import com.springboot.college.exception.UnsupportedException;
import com.springboot.college.props.UploadProps;
import com.springboot.college.util.excelupload.UploadUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @Description TODO
 * @Date 2020/1/4 22:02
 * @Created by zhuozuoying
 */

@Slf4j
@Api(tags = "上传接口")
@RestController
public class UploadController {

    @Autowired
    private UploadProps uploadProps;

    @RequestMapping(value = "/img/upload", method = RequestMethod.POST)
    @ApiOperation(value = "/uploadImg", notes = "上传图片", response = R.class)
    public R uploadImg(@RequestParam(value = "file") MultipartFile file) {
        if(file == null || file.isEmpty()) {
            return R.error("请选择要上传的图片");
        }
        String path = null;
        try {
            path = UploadUtil.uploadImg(file, uploadProps.getFormalPath());
        } catch (IOException e) {
            e.printStackTrace();
            return R.error("上传失败");
        } catch (UnsupportedException e) {
            return R.error("上传失败，图片格式不支持");
        }
        return R.success(path);
    }


}
