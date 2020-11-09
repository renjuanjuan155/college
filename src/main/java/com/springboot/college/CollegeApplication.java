package com.springboot.college;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.springboot.college.mapper")
@ComponentScan(basePackages = {"com.springboot.*"})
public class CollegeApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CollegeApplication.class, args);
		System.out.println("项目启动成功");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return super.configure(builder);
	}
}
