package com.springboot.college.dto;

import org.slf4j.LoggerFactory;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @Description TODO
 * @Date 2020/4/7 16:11
 * @Created by zhuozuoying
 */
public class LoginReq {

//    登录请求类，这个类将会接受并校验用户登录时输入的账号密码

        @SuppressWarnings("unused")
        private static final org.slf4j.Logger log = LoggerFactory.getLogger(LoginReq.class);

        @NotNull(message="账号必须填")
        @Pattern(regexp = "^[1]([3][0-9]{1}|59|58|88|89)[0-9]{8}$", message="账号请输入11位手机号") // 手机号
        private String account;

        @NotNull(message="密码必须填")
        @Size(min=6, max=16, message="密码6~16位")
        private String password;

        private boolean rememberMe;

        public String getAccount() {
            return account;
        }
        public void setAccount(String account) {
            this.account = account;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public boolean isRememberMe() {
            return rememberMe;
        }
        public void setRememberMe(boolean rememberMe) {
            this.rememberMe = rememberMe;
        }

}
