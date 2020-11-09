package com.springboot.college.controller;

import com.springboot.college.common.Result;
import com.springboot.college.dto.LoginReq;
import com.springboot.college.service.inter.AuthService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * @Description TODO
 * @Date 2020/4/7 16:12
 * @Created by zhuozuoying
 */
@RestController
@Api(tags = "登录")
@RequestMapping(value = "/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    /**
     * login
     * @param authRequest
     * @param bindingResult
     * @return ResponseEntity<Result>
     */
    @ApiOperation(value = "用户手机号密码登陆接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account",paramType = "query",value = "账号",required = true,dataType = "String"),
            @ApiImplicitParam(name = "password",paramType = "query",value = "密码",required = true,dataType = "String")
    })
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces="application/json")
    public ResponseEntity<Result> login(@Valid @RequestBody LoginReq authRequest, BindingResult bindingResult) throws AuthenticationException{

        ///这个地方是校验用户名密码的地方，正常是查询数据库///
        /*if(bindingResult.hasErrors()) {
            Result res = MiscUtil.getValidateError(bindingResult);
            return new ResponseEntity<Result>(res, HttpStatus.UNPROCESSABLE_ENTITY);
        }*/
        ///*******************///

        //上面校验完事后就是生成token过程
        final String token = authService.login(authRequest.getAccount(), authRequest.getPassword());

        // Return the token
        Result res = new Result(200, "ok");
        res.putData("token", token);
        return ResponseEntity.ok(res);
    }

    /**
     * refresh
     * @param request
     * @return ResponseEntity<Result>
     */
    @RequestMapping(value = "/refresh", method = RequestMethod.GET, produces="application/json")
    public ResponseEntity<Result> refresh(HttpServletRequest request, @RequestParam String token) throws AuthenticationException {

        Result res = new Result(200, "ok");

        String refreshedToken = authService.refresh(token);

        if(refreshedToken == null) {
            res.setStatus(400);
            res.setMessage("无效token");
            return new ResponseEntity<Result>(res, HttpStatus.BAD_REQUEST);
        }


        res.putData("token", token);
        return ResponseEntity.ok(res);
    }
}
