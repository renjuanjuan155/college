package com.springboot.college.study;

/**
 * @Description优化代码
 * @Date 2020/6/17 16:11
 * @Created by ren
 */
public class OptimizationCode {

    public static void main(String args[]){
        /*//模拟数据
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0;i <= 1000; i++) {
            stringBuilder.append(i).append(";");
        }
        String data = stringBuilder.toString();
        //拆分数据
        long startTime = System.currentTimeMillis();
        data.split(";");
        System.out.println(System.currentTimeMillis() - startTime); //2386
        //使用 StringTokenizer进行分割能节省时间只适用于量非常大的情况下
        long stTime = System.currentTimeMillis();
        StringTokenizer st = new StringTokenizer(data,";");
        while (st.hasMoreTokens()){
            String str = st.nextToken();
        }
        System.out.println(System.currentTimeMillis() - stTime);*/

        String str = "1,1,,2,,";
        String[] split = str.split(",");
        System.out.println(split.length);
        System.out.println(split[3]);
    }


}
