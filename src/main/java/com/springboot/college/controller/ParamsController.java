package com.springboot.college.controller;

import com.springboot.college.common.R;
import com.springboot.college.dto.ParamReq;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Date 2020/4/1 13:59
 * @Created by ren
 */
@Api(tags = "各类传入参数的类型")
@RestController
@RequestMapping(value = "/param")
public class ParamsController {

    /**
     * 通过url传参
     * @param request
     * @param response
     * @param
     * @return
     */
    @RequestMapping(value = "/model",method = RequestMethod.GET,produces="application/json")
    public R model(HttpServletRequest request, HttpServletResponse response){
        String parameter = request.getQueryString();
        Map<String, String> queryParams = getQueryParams(parameter);
        return R.error("fal");
    }

    @RequestMapping(value = "/model2",method = RequestMethod.POST)
    public R model2(@RequestBody @NotNull ParamReq paramReq){
        ParamReq a = paramReq;
        return R.success();
    }

    public static Map<String,String> getQueryParams(String parameter) {
        try {
            Map<String, String> params = new HashMap<String, String>();
            for (String param : parameter.split("&")) {
                String[] pair = param.split("=");
                String key = URLDecoder.decode(pair[0], "UTF-8");
                String value = "";
                if (pair.length > 1) {
                    value = URLDecoder.decode(pair[1], "UTF-8");
                }
                params.put(key, value);
            }
            return params;
        } catch (UnsupportedEncodingException ex) {
            throw new AssertionError(ex);
        }
    }

}
