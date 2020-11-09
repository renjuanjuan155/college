package com.springboot.college.service.inter;

import com.springboot.college.model.jwt.User;

/**
 * @Description TODO
 * @Date 2020/4/7 16:20
 * @Created by zhuozuoying
 */
public interface AuthService {
    User register(User userToAdd);
    String login(String username, String password);
    String refresh(String oldToken);
}