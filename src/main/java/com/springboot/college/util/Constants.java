package com.springboot.college.util;

/**
 * @Description
 * @Date 2020/3/25 16:23
 * @Created by renjuanjuan
 */
public class Constants {

    //忘记密码输入验证码保存的session
    public static final String LOGIN_VALIDATE_CODE = "sessionId_validate_code";


    /**
     * 邀请注册页面地址
     */
    public static final String REGISTER_ADDRESS = "https://www.baidu.com/";

    //上传图片接口
    public static final String ROUTE_IMG = "uploadImg";
    public static final String[] IMG_TYPE = {"jpg", "jpeg", "png", "bmp", "gif"};

    //订单支付支付宝回调地址
    public static String ALIPAY_ORDER_CALLBACK = "http://mall.gzmhyj.com:8085/huakuEComBuyer/pay/aliPayOrderCallBack";

    public static final String JWT_TOKEN_TYPE = "Bearer";

}
