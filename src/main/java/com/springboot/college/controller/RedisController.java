package com.springboot.college.controller;

import com.springboot.college.dto.PageReq;
import com.springboot.college.dto.RedisDto;
import com.springboot.college.service.RedisService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2020/6/23 13:59
 * @Created by ren
 */
@RestController
@Api(tags = "整合redis缓存")
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisService redisService;
    @PostMapping("/redisCache")
    public List<RedisDto> redis(){

        return redisService.getUser();

    }

    @PostMapping("/getUserPage")
    public List<Map<String, String>> getUserPage(@RequestBody PageReq pageReq){
        return redisService.getUserPage(pageReq);
    }
}
