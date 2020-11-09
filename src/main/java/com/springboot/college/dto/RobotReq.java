package com.springboot.college.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2020/5/25 14:51
 * @Created by ren
 */
@ApiModel("机器人入参")
public class RobotReq {
    @ApiModelProperty("机器人接口入参类型")
    private List<Map<String,String>> robotReq;

    public List<Map<String, String>> getRobotReq() {
        return robotReq;
    }

    public void setRobotReq(List<Map<String, String>> robotReq) {
        this.robotReq = robotReq;
    }
}
