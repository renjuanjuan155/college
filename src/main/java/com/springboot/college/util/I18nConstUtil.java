package com.springboot.college.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.NoSuchMessageException;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

/**
 * @Description 定义国际化常量
 * @Date 2019/12/13 15:10
 * @Created by zhuozuoying
 */

@Slf4j
public class I18nConstUtil {

    public abstract class CommonMsg {
        public static final String SUCCESS = "success";
        public static final String BODY_NOT_MATCH = "body_not_match";
        public static final String SIGNATURE_NOT_MATCH = "signature_not_match";
        public static final String ACCESS_DENIED = "access_denied";
        public static final String NOT_FOUND = "not_found";
        public static final String INTERNAL_SERVER_ERROR = "internal_server_error";
        public static final String SERVER_BUSY = "server_busy";
        public static final String REQUEST_METHOD_SUPPORT_ERROR = "request_method_support_error";
        public static final String REQUEST_TOKEN_EXPIRED_ERROR = "request_token_expired_error";
        public static final String REQUEST_INVALID_REQUEST_ERROR = "request_invalid_request_error";
    }

    public abstract class Login {
        public static final String LOGIN_ACCOUNT_PWD_WRONG = "login_account_pwd_wrong";
        public static final String LOGIN_WX_CODE_EMPTY = "login_wx_code_empty";
    }

    public abstract class Faq {

    }

    public abstract class Feedback {

    }

    public abstract class Language {

    }

    public abstract class User {

    }

    public static String getLocaleMessage(String code) {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        Locale locale = RequestContextUtils.getLocale(request);
        WebApplicationContext wac = RequestContextUtils.findWebApplicationContext(request);
        try {
            return wac.getMessage(code, null, locale);
        } catch (NoSuchMessageException e) {
            log.debug("getLocaleMessage =>" + e.getMessage());
        }
        return code;
    }

}
