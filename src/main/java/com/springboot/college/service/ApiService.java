package com.springboot.college.service;

import com.springboot.college.dto.ApiReq;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description
 * @Date 2020/6/22 10:12
 * @Created by ren
 */
@Service
public class ApiService {
    private final String KEY = "1111";

    @Value("${apiTest:urlTest:getConstellationUrl:http://web.juhe.cn:8080/constellation/getAll}")
    private String getConstellationUrl;

    @Resource
    private RestTemplate restTemplate;

    public Object getConstellation(ApiReq apiReq){

        MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
        paramMap.add("consName",apiReq.getConsName());
        paramMap.add("type",apiReq.getType());
        paramMap.add("key",apiReq.getKey());
        ParameterizedTypeReference<MultiValueMap<String, Object>> param = new ParameterizedTypeReference<MultiValueMap<String, Object>>() {};
        ResponseEntity<MultiValueMap<String, Object>> responseParam = restTemplate.exchange(getConstellationUrl
                , HttpMethod.POST,new HttpEntity<>(apiReq),param);
        Object reason = responseParam.getBody().get("reason");

        return reason;
    }
}
