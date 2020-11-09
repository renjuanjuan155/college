package com.springboot.college.model.jwt;

import lombok.Data;

/**
 * @Description TODO
 * @Date 2020/4/7 16:08
 * @Created by zhuozuoying
 */
@Data
public class User {
//    User实体类对应于数据库中的User表（我们简化了，没有连数据库）
    private Long id;

    private String nickname;

    private String mobile;

    private String password;

    private String role;

    public User(Long id, String nickname, String mobile, String password, String role) {
        this.id = id;
        this.nickname = nickname;
        this.mobile = mobile;
        this.password = password;
        this.role = role;
    }

    public User() {
        super();
    }
}