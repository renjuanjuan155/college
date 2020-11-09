package com.springboot.college.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Date 2020/3/31 17:17
 * @Created by zhuozuoying
 */
@Service
public class SendEmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private TemplateEngine templateEngine;

    @Value("${spring.mail.username}")
    private String emailfrom;

//    public boolean sendEmail(EmailReq emailReq){
//
//        String name = emailReq.getUsername();
//        String emailname = emailReq.getEmail();
//        if (!"test".equals(name)){
//            return false;
//        }
//
//        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
//        try {
//            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
//            mimeMessageHelper.setTo(emailname);
//            mimeMessageHelper.setFrom(email);
//            mimeMessageHelper.setSubject("college");
//            mimeMessageHelper.setText("你好！",true);
//            javaMailSender.send(mimeMessage);
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//        return true;
//
//    }

    @Scheduled(cron = "* * * * * 1-7")
    public void cron(){
        SimpleDateFormat simpDateFormat = new SimpleDateFormat("yy-mm-dd HH:mm:ss");
        String time = simpDateFormat.format(new Date(System.currentTimeMillis()));

    }

    /*发送带有附件的邮件*/
    public boolean sendMail(String mailTo) {
        String attachFilePath = "C:\\Users\\EDZ\\Pictures\\2.jpg";
        MimeMessage message=javaMailSender.createMimeMessage();
        MimeMessageHelper helper = null;
        try {
            helper = new MimeMessageHelper(message, true);
            helper.setFrom(emailfrom);
            helper.setTo(mailTo);
            helper.setSubject("simple mail测试邮件");
            helper.setText("<b><h1 style='color:red'>今晚要去吃好吃的</h1></b>",true);
            helper.addAttachment("好东西.jpg",new File(attachFilePath));
//            FileSystemResource file = new FileSystemResource(new File("E:\\myself\\test.xls"));
//            String fileName = file.getFilename();
//            helper.addAttachment(fileName, file);
            javaMailSender.send(message);
            System.out.println("邮件已经发送");
            return true;
        } catch (MessagingException e) {
            System.out.println("e");
        }
        return false;
    }

    /*发送带有模板的邮件*/
    public boolean sendMailTemplate(String mailTo) {
        String attachFilePath = "C:\\Users\\EDZ\\Pictures\\2.jpg";
        MimeMessage message=javaMailSender.createMimeMessage();
        MimeMessageHelper helper = null;

        //可以看作一个白纸
        Context context = new Context();
        //设置一个变量，可以在themeleaf中随时可以根据id取值，而且这个value应该是用户注册时候动态生成的，这里先固定生成
        context.setVariable("id","ren");
        //模板引擎去解析这个模板名，找到真正的视图，解析完以后放在一个白纸上（context）
        String pocess = templateEngine.process("emailTemplate",context);
        try {
            helper = new MimeMessageHelper(message, true);
            helper.setFrom(emailfrom);
            helper.setTo(mailTo);
            helper.setSubject("simple mail测试邮件");
            helper.setText("<b><h1 style='color:red'>今晚要去吃好吃的</h1></b>",true);
            helper.addAttachment("好东西.jpg",new File(attachFilePath));
//            FileSystemResource file = new FileSystemResource(new File("E:\\myself\\test.xls"));
//            String fileName = file.getFilename();
//            helper.addAttachment(fileName, file);
            javaMailSender.send(message);
            System.out.println("邮件已经发送");
            return true;
        } catch (MessagingException e) {
            System.out.println("e");
        }
        return false;
    }


    /*普通发送邮件不带附件*/
    /*public boolean sendMail(String mailTo) {
        MimeMessage message=javaMailSender.createMimeMessage();
        SimpleMailMessage helper = null;
        try {
            helper = new SimpleMailMessage ();
            helper.setFrom(emailfrom);
            helper.setTo(mailTo);
            helper.setSubject("simple mail");
            helper.setText("hello world");
//            FileSystemResource file = new FileSystemResource(new File("E:\\myself\\test.xls"));
//            String fileName = file.getFilename();
//            helper.addAttachment(fileName, file);
            javaMailSender.send(helper);
            System.out.println("邮件已经发送");
            return true;
        } catch (Exception  e) {
            System.out.println(e);
        }
        return false;
    }*/
}
