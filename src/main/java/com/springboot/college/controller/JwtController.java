package com.springboot.college.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Date 2020/4/7 15:06
 * @Created by zhuozuoying
 */
@RestController
@RequestMapping(value = "/jwt")
public class JwtController {


    @RequestMapping(value="/hello1", method= RequestMethod.GET)
    public String hello1() {

        return "Hello1!";
    }

    @RequestMapping(value="/hello2", method=RequestMethod.GET)
    public String hello2() {

        return "Hello2!";
    }

    //在SercurityConfig中设置需要登录才能访问的接口
    @RequestMapping(value="/hello3", method=RequestMethod.GET)
    public String hello3() {

        return "Hello3!";
    }
}
