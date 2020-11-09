package com.springboot.college.service;

import com.springboot.college.mapper.JshUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Description TODO
 * @Date 2020/4/17 15:55
 * @Created by zhuozuoying
 */
@Service
public class UserService {
    @Autowired
    JshUserMapper jshUserMapper;
    public Map<String,String> getUser(String username){
        return jshUserMapper.getUser(username);
    }
}
