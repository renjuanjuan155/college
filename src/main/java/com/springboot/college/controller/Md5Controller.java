package com.springboot.college.controller;

import com.springboot.college.util.Md5Util;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

/**
 * @Description TODO
 * @Date 2020/4/16 11:57
 * @Created by zhuozuoying
 */
@Api(tags = "密码 加密")
@RestController
@RequestMapping("/md5")
public class Md5Controller {

    @GetMapping(value = "/md5")
    public String md5(@RequestParam(value = "pass") String pass){


        String md5 = Md5Util.getMd5("MD5", 0, "utf-8", pass);
        String s = Md5Util.encodeByMD5(pass);
        return s+"+"+md5;
    }

}
