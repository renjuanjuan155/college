package com.springboot.college.dto;

import lombok.Data;

/**
 * @Description TODO
 * @Date 2020/3/31 17:21
 * @Created by zhuozuoying
 */
@Data
public class EmailReq {

    private String username;
    private String url;
    private String password;
    private String email;

}
