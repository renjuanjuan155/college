package com.springboot.college.controller;

import com.springboot.college.common.R;
import com.springboot.college.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Description TODO
 * @Date 2020/3/25 16:42
 * @Created by zhuozuoying
 */
@Api
@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public R getLogin(@RequestParam("username") String username){
        if (username.equals(null)){
            return R.error("格式不对");
        }
        Map<String,String> map = userService.getUser(username);
        return R.success(map.get("username"));
    }
}
