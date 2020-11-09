package com.springboot.college.controller;

import com.springboot.college.dto.ApiReq;
import com.springboot.college.service.ApiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @Date 2020/6/22 10:11
 * @Created by ren
 */
@RestController
@Api(tags = "调用第三方接口")
@ApiModel("测试")
@RequestMapping("/api")
public class ApiController {

    @Resource
    private ApiService apiService;

    @PostMapping("/getConstellation")
    @ApiOperation(value = "第三方接口实现")
    public Object getConstellation(@RequestBody ApiReq apiReq){
        apiReq.setConsName("天秤座");
        apiReq.setType("today");
        apiReq.setKey("111");
        return apiService.getConstellation(apiReq);
    }
}
