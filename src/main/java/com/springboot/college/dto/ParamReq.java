package com.springboot.college.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2020/4/1 14:59
 * @Created by zhuozuoying
 */
@Data
public class ParamReq {

    @NotNull
    private List<Map<String,Object>> data;
}
