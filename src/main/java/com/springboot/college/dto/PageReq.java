package com.springboot.college.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description TODO
 * @Date 2020/6/23 16:38
 * @Created by zhuozuoying
 */
@Data
@ApiModel("分页参数")
public class PageReq {

    @ApiModelProperty("当前页")
    private int  currentPage;

    @ApiModelProperty("每页限制数")
    private int limit;
}
