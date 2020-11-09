package com.springboot.college.common;


/**
 * @Description TODO
 * @Date 2019/12/13 15:10
 * @Created by zhuozuoying
 */
public enum CommonEnum implements ErrorInfoInterface {

    // 数据操作错误定义
    SUCCESS("200", "成功"),
    BODY_NOT_MATCH("Bad Request","400", "请求的数据格式不符"),
    REQUEST_TOKEN_EXPIRED("Invalid Grant","401", "token过期或无效，请重新登录"),
    ACCESS_DENIED("Forbidden", "403", "拒绝访问"),
    NOT_FOUND("Not Found","404", "未找到该资源"),
    METHOD_NOT_ALLOWED("Method Not Allowed","405", "方法参数无效"),
    INTERNAL_SERVER_ERROR("Internal Server Error","500", "服务器内部错误"),
    SERVICE_UNAVAILABLE("Internal Server Error","503", "服务器不可用，请稍后再试"),
    LOGIN_VALID("Invalid Grant","401", "提供账号或密码无效"),
    INVALID_GRANT("Invalid Grant","401", "");

    private String error;
    private String status;
    private String message;

    CommonEnum(String code, String message) {
        this.status = code;
        this.message = message;
    }

    CommonEnum(String error, String code, String message) {
        this.error = error;
        this.status = code;
        this.message = message;
    }

    @Override
    public String getError() {
        return error;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
