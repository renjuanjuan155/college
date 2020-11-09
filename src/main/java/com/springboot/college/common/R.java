package com.springboot.college.common;

import com.springboot.college.util.I18nConstUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.HashMap;

/**
 * @Description 统一返回数据
 * @Date 2019/12/13 15:10
 * @Created by zhuozuoying
 */
public class R extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    public R() {
        put("status", 0);
    }

    /**
     *
     * @param errorInfoInterface
     * @param data
     */
    private R(ErrorInfoInterface errorInfoInterface, Object data) {
        setStatus(errorInfoInterface.getStatus());
        setMsg(errorInfoInterface.getMessage());
        setError(errorInfoInterface.getError());
        setData(data);
        setTimestamp();
    }

    /**
     *
     * @param errorInfoInterface
     * @param data
     * @param msg
     */
    private R(ErrorInfoInterface errorInfoInterface, Object data, String msg) {
        setError(errorInfoInterface.getError());
        setStatus(errorInfoInterface.getStatus());
        setMsg(msg);
        setData(data);
        setTimestamp();
    }

    /**
     *
     * @param commonEnum
     * @return
     */
    public static R error(CommonEnum commonEnum) {
        return newInstance(commonEnum, null);
    }

    /**
     *
     * @param commonEnum
     * @return
     */
    public static R error(CommonEnum commonEnum, String msg) {
        return newInstance(commonEnum, null, msg);
    }

    /**
     *
     * @param msg
     * @return
     */
    public static R error(String msg) {
        return newInstance(CommonEnum.INTERNAL_SERVER_ERROR, null, msg);
    }

    /**
     *
     * @param errorInfoInterface
     * @return
     */
    public static R error(final ErrorInfoInterface errorInfoInterface) {
        if(StringUtils.isBlank(errorInfoInterface.getStatus())) {
            return error(errorInfoInterface.getMessage());
        }
        return newInstance(errorInfoInterface, null);
    }

    /**
     *
     * @param data
     * @return
     */
    public static R success(Object data) {
        return newInstance(CommonEnum.SUCCESS, data);
    }

    /**
     *
     * @return
     */
    public static R success() {
        return newInstance(CommonEnum.SUCCESS, null);
    }

    /**
     * 自定义结果信息
     *
     * @param key   属性名称
     * @param value 结果数据
     * @return
     */
    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    /**
     * 设置响应结果状态码
     *
     * @param status 请求结果状态码
     * @return
     */
    public R setStatus(String status) {
        put("status", status);
        return this;
    }

    /**
     * 设置响应数据
     *
     * @param data 结果数据
     * @return
     */
    public R setData(Object data) {
        if(data != null) {
            put("data", data);
        }
        return this;
    }

    /**
     * 设置响应时间
     *
     * @return
     */
    public R setTimestamp() {
        put("timestamp", new Date().getTime());
        return this;
    }

    /**
     *
     * @param error
     * @return
     */
    public R setError(String error) {
        if(StringUtils.isNotBlank(error)) {
            put("error", error);
        }
        return this;
    }

    /**
     * 设置响应结果信息
     *
     * @param msg 请求结果信息说明
     * @return
     */
    public R setMsg(String msg) {
        if (null == msg) {
            put("message", "");
        } else {
            put("message", I18nConstUtil.getLocaleMessage(msg));
        }
        return this;
    }

    public static R newInstance(ErrorInfoInterface errorInfo, Object data, String msg) {
        return new R(errorInfo, data, msg);
    }

    public static R newInstance(ErrorInfoInterface errorInfoInterface, Object data) {
        return new R(errorInfoInterface, data);
    }

}
