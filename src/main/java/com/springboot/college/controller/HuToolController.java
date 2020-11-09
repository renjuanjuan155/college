package com.springboot.college.controller;

import cn.hutool.crypto.SecureUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Date 2020/6/30 19:14
 * @Created by zhuozuoying
 */
@RestController
@RequestMapping("/hutool")
public class HuToolController {

    @PostMapping("/tool")
    public void  tool() {
        String s = SecureUtil.md5("123456");

    }
}
