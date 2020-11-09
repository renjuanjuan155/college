package com.springboot.college.controller;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.springboot.college.util.Constants;
import com.springboot.college.util.QRcodeUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Date 2020/3/25 14:07
 * @Created by renjuanjuan
 */
@Api(tags = "验证码生成")
@RestController
@RequestMapping("/code")
public class CreateCodeController {

    @Autowired
    private DefaultKaptcha defaultKaptcha;

    /**
     * 生成验证码4字英文
     * @param request
     * @param response
     */
    @RequestMapping(value = "/getCreateCode",method = RequestMethod.GET)
    private void createCode(HttpServletRequest request, HttpServletResponse response){

        byte[] numCodeImgByte = null;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        //图片转为base64
        BASE64Encoder encoder = new BASE64Encoder();
        try {
            String successCode = defaultKaptcha.createText();
            BufferedImage bi = defaultKaptcha.createImage(successCode);
            request.getSession().setAttribute(Constants.LOGIN_VALIDATE_CODE, successCode);
            ImageIO.write(bi, "jpg", jpegOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        numCodeImgByte = jpegOutputStream.toByteArray();
        String baseImg = encoder.encode(numCodeImgByte).trim();
        //替换、\n\r
        baseImg = baseImg.replaceAll("\n","").replaceAll("\r","");
        response.setHeader("Cache-Control","no-store");
        response.setHeader("Pragma","no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("base64", baseImg);
        response.setContentType("image/jpeg");
        ServletOutputStream sos = null;
        try {
            sos = response.getOutputStream();
            sos.write(numCodeImgByte);
            sos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 生成二维码，带logo、不带logo
     */
    @RequestMapping(value = "/createQRcode" ,method = RequestMethod.POST)
    public void createQRcode(HttpServletRequest request,HttpServletResponse response){
        // 邀请注册地址
        String address = Constants.REGISTER_ADDRESS;
        // 嵌入二维码的图片路径
        String imgPath = "D:\\picture/2.jpg";
        // 拼接二维码内容
        StringBuffer sb = new StringBuffer(address);
        // 注册地址
        String inviteUrl = sb.toString();
        try {
            // 响应二维码图片流带logo
            QRcodeUtil.createQrCodeStreamLogo(inviteUrl,900,"PNG",imgPath,true,response);
            //不带logo
            //QRcodeUtil.createQrCodeStream(inviteUrl,500,"PNG",response);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (WriterException e) {
            e.printStackTrace();
        }
    }

    //另一种方法
    /**
    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public void create(HttpServletRequest request,HttpServletResponse response){
        String text = "https://www.baidu.com/";
        // 嵌入二维码的图片路径
        String imgPath = "D:\\picture/1.jpg";
        // 生成的二维码的路径及名称
        String destPath = "D:\\picture/1.jpg";
        File logo = new File("D:\\picture/1.jpg");
        //生成二维码
        try {
            //QRcodeUtil.encode(text, imgPath, destPath, true,response);
            // 解析二维码
            //String str = QRcodeUtil.decode(destPath);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }*/

    @GetMapping(value = "/getCode")
    public void getCode(){
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        try {
            // 第一个参数为二维码的内容 第二个参数不变  第三 四 个参数依次为 宽高
            BitMatrix bitMatrix = qrCodeWriter.encode("https://www.wechat.com/zh_HK", BarcodeFormat.QR_CODE,10,10);
            //将二维码保存为 png 本地图片。
            try {
                MatrixToImageWriter.writeToPath(bitMatrix, "png", Paths.get("D:\\personal\\qr.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (WriterException e) {
            e.printStackTrace();
        }
    }
    @GetMapping(value = "/getCode2")
    public String getCod2(){
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        try {
//            控制编码的字符集和纠错率
            Map<EncodeHintType, Object> hints = new HashMap<>();
            hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
            hints.put(EncodeHintType.CHARACTER_SET,"UTF-8");
            // 第一个参数为二维码的内容 第二个参数不变  第三 四 个参数依次为 宽高
            BitMatrix bitMatrix = qrCodeWriter.encode("https://www.wechat.com/zh_HK", BarcodeFormat.QR_CODE,10,10,hints);
            //将二维码base64输出流。
//            Base64 展示体积小的二维码是没有问题的，如果生成的 Base64 字符串比较长将会有较大的渲染消耗。实际生产中要权衡利弊。
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                MatrixToImageWriter.writeToStream(bitMatrix, "png", byteArrayOutputStream);
                byte[] bytes = byteArrayOutputStream.toByteArray();
                String base64Image = new BASE64Encoder().encode(bytes);
                return base64Image;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (WriterException e) {
            e.printStackTrace();
        }
        return "";
    }

    @GetMapping(value = "/getCode3")
    public void getCod3(HttpServletResponse response){
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        try {
//            控制编码的字符集和纠错率
            Map<EncodeHintType, Object> hints = new HashMap<>();
            hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
            hints.put(EncodeHintType.CHARACTER_SET,"UTF-8");
            // 第一个参数为二维码的内容 第二个参数不变  第三 四 个参数依次为 宽高
            BitMatrix bitMatrix = qrCodeWriter.encode("https://www.wechat.com/zh_HK", BarcodeFormat.QR_CODE,10,10,hints);
            //将二维码base64输出流。
//            Base64 展示体积小的二维码是没有问题的，如果生成的 Base64 字符串比较长将会有较大的渲染消耗。实际生产中要权衡利弊。
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                MatrixToImageWriter.writeToStream(bitMatrix, "png", byteArrayOutputStream);
                byte[] bytes = byteArrayOutputStream.toByteArray();
                String base64Image = new BASE64Encoder().encode(bytes);
                //字节数组输入流,有以下可以按照输出图片
                ByteArrayInputStream imageIn = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                BufferedImage bImage = ImageIO.read(imageIn);
                OutputStream out = response.getOutputStream();
                ImageIO.write(bImage, "jpg", out);
                bImage.flush();
                out.flush();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (WriterException e) {
            e.printStackTrace();
        }
    }

    /**
     * 动态生成二维码
     * @param response
     * @throws IOException
     * @throws WriterException
     */
    @GetMapping("/felord")
    public void gen(HttpServletResponse response) throws IOException, WriterException {
        response.setContentType("image/png");
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(imageBytes());
        outputStream.flush();
        outputStream.close();
    }
    private byte [] imageBytes() throws IOException, WriterException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        Map<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        hints.put(EncodeHintType.CHARACTER_SET,"UTF-8");
        BitMatrix bitMatrix = qrCodeWriter.encode("https://www.felord.cn", BarcodeFormat.QR_CODE, 80, 80,hints);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix,"png",byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }



}
