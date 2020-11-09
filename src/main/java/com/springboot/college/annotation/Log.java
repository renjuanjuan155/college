package com.springboot.college.annotation;

import java.lang.annotation.*;

/**Spring Boot AOP记录用户操作日志,自定义注解，方法级别的@Log注解，用于标注需要监控的方法：
 * @Description TODO
 * @Date 2020/4/13 14:53
 * @Created by zhuozuoying
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface   Log {
    String value() default "";
}
