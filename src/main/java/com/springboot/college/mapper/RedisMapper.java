package com.springboot.college.mapper;

import com.springboot.college.dto.RedisDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description TODO
 * @Date 2020/6/23 15:16
 * @Created by zhuozuoying
 */
@Mapper
@Component("RedisMapper")
public interface RedisMapper {

    List<RedisDto> getUser();
}
