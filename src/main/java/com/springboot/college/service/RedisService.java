package com.springboot.college.service;

import com.springboot.college.dto.PageReq;
import com.springboot.college.dto.RedisDto;
import com.springboot.college.mapper.RedisMapper;
import com.springboot.college.util.RedisPageUtil;
import com.springboot.college.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2020/6/23 15:15
 * @Created by ren
 */
@Service
public class RedisService {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private RedisPageUtil redisPageUtil;

    @Autowired
    private RedisMapper redisMapper;

    public List<RedisDto> getUser(){
        if (redisUtil.hasKey("userList")){
            //从redis中获取数据
            return (List<RedisDto>) redisUtil.get("userList");
        }else {
            List<RedisDto> userList = redisMapper.getUser();
            redisUtil.set("userList",userList);
            return userList;
        }
    }

    public List<Map<String, String>> getUserPage(PageReq pageReq){
        if (redisUtil.hasKey("userListPages")){
            //从redis中获取数据分页
            List<Map<String, String>> mapList = redisPageUtil.pageSort("userListPages", "1", pageReq.getCurrentPage(), pageReq.getLimit());
            return mapList;
        }else {
            List<RedisDto> userList = redisMapper.getUser();
//            redisUtil.set("userList",userList);
            redisPageUtil.batchHashSet("userListPages",userList,"1");
            List<Map<String, String>> mapList = redisPageUtil.pageSort("userListPages", "1", pageReq.getCurrentPage(), pageReq.getLimit());
            return mapList;
        }

    }

}
