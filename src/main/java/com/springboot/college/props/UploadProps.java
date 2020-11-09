package com.springboot.college.props;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Date 2020/1/5 0:40
 * @Created by zhuozuoying
 */
@Data
@Component
@Configuration
@ConfigurationProperties(prefix = "spring")
public class UploadProps {

    @Value("${spring.servlet.multipart.location}")
    private String formalPath;
}
