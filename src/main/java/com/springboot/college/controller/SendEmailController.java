package com.springboot.college.controller;

import com.springboot.college.common.R;
import com.springboot.college.dto.EmailReq;
import com.springboot.college.service.SendEmailService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description
 * @Date 2020/3/31 16:45
 * @Created by renjuanjuna
 */
@Api(tags = "发送邮件")
@RequestMapping(value = "/send")
@RestController
public class SendEmailController {

    @Autowired
    private SendEmailService sendEmailService;

    /**
     * 有问题Failed messages: com.sun.mail.smtp.SMTPSendFailedException: 502 Invalid input from 36.27.65.28 to newxmesmtplogicsvrsza7.qq.com.\n
     * @param request
     * @param emailReq
     * @return
     */
    @RequestMapping(value = "/sendEmail",method = RequestMethod.POST)
    public R send(HttpServletRequest request, @RequestBody EmailReq emailReq){
        if (emailReq.getUsername() == null || "".equals(emailReq.getUsername()) || "".equals(emailReq.getEmail()) || emailReq.getEmail() == null){
            return R.error("请输入正确的用户名和密码");
        }
        boolean result = sendEmailService.sendMail(emailReq.getEmail());
        return R.success(result);

    }


}
