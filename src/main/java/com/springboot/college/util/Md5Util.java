package com.springboot.college.util;


import javax.crypto.Cipher;
import java.math.BigInteger;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author ccc-ju
 */
public class Md5Util {
    /**
     * 十六进制下数字到字符的映射数组
     */
    private final static String[] HEX_DIGITS = {"0", "1", "2", "3", "4",
            "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    /**
     * md5加密算法
     * @param  originString 待加密字符串
     * @return 加密后的字符串
     */
    public static String encodeByMD5(String originString){
        if (originString != null){
            try{
                //创建具有指定算法名称的信息摘要
                MessageDigest md = MessageDigest.getInstance("MD5");
                //使用指定的字节数组对摘要进行最后更新，然后完成摘要计算
                byte[] results = md.digest(originString.getBytes());
                //将得到的字节数组变成字符串返回
                String resultString = byteArrayToHexString(results);
                return resultString.toUpperCase();
            } catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 转换字节数组为十六进制字符串
     * @param
     * @return    十六进制字符串
     */
    private static String byteArrayToHexString(byte[] b){
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++){
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    /** 将一个字节转化成十六进制形式的字符串     */
    private static String byteToHexString(byte b){
        int n = b;
        if (n < 0) {
            n = 256 + n;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return HEX_DIGITS[d1] + HEX_DIGITS[d2];
    }

    /**
     *
     * @param Md5OrSHA 加密类型 MD5,SHA1,SHA
     * @param type     0=32位 1=16位
     * @param encoding UTF-8 编码
     * @param text     string 字符串
     * @return
     */
    public static String getMd5(String Md5OrSHA, int type, String encoding, String text) {
        // 返回字符串
        String md5Str = null;
        if (null == encoding) {
            encoding = "utf-8";
        }
        if (null == Md5OrSHA) {
            Md5OrSHA = "MD5";
        }
        try {
            // 操作字符串
            StringBuffer buf = new StringBuffer();
            MessageDigest md = MessageDigest.getInstance(Md5OrSHA);
            // 添加要进行计算摘要的信息,使用 text 的 byte 数组更新摘要。
            md.update(text.getBytes(encoding));
            // 计算出摘要,完成哈希计算。
            byte b[] = md.digest();
            int i;
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                // 将整型 十进制 i 转换为16位，用十六进制参数表示的无符号整数值的字符串表示形式。
                buf.append(Integer.toHexString(i));
            }
            if (type == 0) {
                // 32位的加密
                md5Str = buf.toString();
            } else {
                // 16位的加密
                md5Str = buf.toString().substring(8, 24);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return md5Str;
    }

    /**
     *
     * @param deskey   密钥
     * @param type     0为加密,1为解密
     * @param str      内容
     * @param encoding 编码 utf-8;
     * @return
     */
    public static String getDes(String deskey, int type, String str, String encoding) {
//		Security.addProvider(new com.sun.crypto.provider.SunJCE());
        if (null == encoding) {
            encoding = "utf-8";
        }
        try {
            byte[] desbyte = deskey.getBytes();
            byte[] arrB = new byte[8];// 创建一个空的8位字节数组（默认值为0）
            for (int i = 0; i < desbyte.length && i < arrB.length; i++) { // 将原始字节数组转换为8位
                arrB[i] = desbyte[i];
            }
            Key key = new javax.crypto.spec.SecretKeySpec(arrB, "DES");// 生成密钥
            byte[] byStr = str.getBytes(encoding);
            Cipher cipher = Cipher.getInstance("DES");
            if (type == 0) {
                // 0为加密
                cipher.init(Cipher.ENCRYPT_MODE, key);
                byte[] btArrC = cipher.doFinal(byStr);
                int iLen = btArrC.length;
                // 每个byte用两个字符才能表示，所以字符串的长度是数组长度的两倍
                StringBuffer sb = new StringBuffer(iLen * 2);
                for (int i = 0; i < iLen; i++) {
                    int intTmp = btArrC[i];
                    // 把负数转换为正数
                    while (intTmp < 0) {
                        intTmp = intTmp + 256;
                    }
                    // 小于0F的数需要在前面补0
                    if (intTmp < 16) {
                        sb.append("0");
                    }
                    sb.append(Integer.toString(intTmp, 16));
                }
                return sb.toString();
            } else {
                // 解密
                cipher.init(Cipher.DECRYPT_MODE, key);
                int iLen = byStr.length;
                // 两个字符表示一个字节，所以字节数组长度是字符串长度除以2
                byte[] arrOut = new byte[iLen / 2];
                for (int i = 0; i < iLen; i = i + 2) {
                    String strTmp = new String(byStr, i, 2);
                    arrOut[i / 2] = (byte) Integer.parseInt(strTmp, 16);
                }
                return new String(cipher.doFinal(arrOut));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    /*****************************************************
     * 功能介绍: 获取随机字符串
     * 输入参数: Token 长度
     * 输出参数: 随机字符串
     *****************************************************/
    private final static String randToken(int len) {
        char[] code = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D',
                'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        StringBuffer str_buf = new StringBuffer();
        for (int i = 0; i < len; i++) {
            str_buf.append(code[(int) (Math.random() * 62)]);
        }

        return str_buf.toString();
    }

    /*****************************************************
     * 功能介绍: 获取唯一值
     * 输入参数: （无）
     * 输出参数: 返回唯一值
     *****************************************************/
    public final static String randID() {
        return randToken(10);
    }

    public final static String randDom() {
        return String.valueOf((int) ((Math.random() * 9 + 1) * 100000));
    }


    /**
     * SHA-512哈希函数的实现
     * @param input
     * @return
     */
    public static String encryptThisString(String input)
    {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}
