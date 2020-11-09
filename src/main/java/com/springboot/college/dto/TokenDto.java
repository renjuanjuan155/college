package com.springboot.college.dto;

import com.springboot.college.util.Constants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TODO
 * @Date 2020/4/7 16:26
 * @Created by zhuozuoying
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenDto {

    private String tokenType = Constants.JWT_TOKEN_TYPE;
    private String accessToken;
    private String refreshToken;
    private long expires_in;
    private String username;

}
