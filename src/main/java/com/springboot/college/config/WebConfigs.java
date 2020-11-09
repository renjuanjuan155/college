package com.springboot.college.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description TODO
 * @Date 2020/6/2 18:26
 * @Created by zhuozuoying
 */
@Data
@Configuration
public class WebConfigs implements WebMvcConfigurer {

    @Value("${file.fileupload}")
    private String fileupload;

    @Value("${file.staticAccessPath}")
    private String staticAccessPath;

//主要在这里
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(staticAccessPath).addResourceLocations("file:" + fileupload);
    }


}
