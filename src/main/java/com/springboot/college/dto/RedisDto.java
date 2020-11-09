package com.springboot.college.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description
 * @Date 2020/6/23 15:19
 * @Created by ren
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RedisDto {
    private String id;
    private String username;
}
