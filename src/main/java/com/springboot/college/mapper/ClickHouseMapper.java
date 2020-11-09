package com.springboot.college.mapper;

import com.jcraft.jsch.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description TODO
 * @Date 2020/4/17 18:50
 * @Created by zhuozuoying
 */
@Mapper
@Component("ClickHouseMapper")
public interface ClickHouseMapper {
    // 写入数据
    void saveData (UserInfo userInfo) ;
    // ID 查询
    UserInfo selectById (@Param("id") Integer id) ;
    // 查询全部
    List<UserInfo> selectList () ;
}
