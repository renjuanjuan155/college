package com.springboot.college.util;

import java.util.Random;
import java.util.UUID;

/**
 * @Description TODO
 * @Date 2019/12/20 14:58
 * @Created by zhuozuoying
 */
public class UniqueUUID {

    /**
     * @return 平台主键Key生成有序UUID
     */
    public static String orderUUID() {
        Random rand = new Random();
        return System.currentTimeMillis() + String.valueOf(rand.nextInt(10000) + 10000) ;
    }

    /**
     * @return 生成32随机UUID
     */
    public static String randomUUID() {
        UUID uuid = UUID.randomUUID();
        String sUuid = uuid.toString();
        String sNewUuid = sUuid.replaceAll("-", "");
        sNewUuid = sNewUuid.toUpperCase();
        return sNewUuid;
    }

    public static void main(String[] args) {
        System.out.println(randomUUID());
    }
}
