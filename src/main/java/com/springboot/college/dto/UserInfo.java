package com.springboot.college.dto;

import lombok.Data;

/**
 * @Description TODO
 * @Date 2020/4/17 18:53
 * @Created by zhuozuoying
 */
@Data
public class UserInfo {

    private Integer id;
    private String userName;
    private String passWord;
    private String phone;
    private String email;
    private String createDay;
}
