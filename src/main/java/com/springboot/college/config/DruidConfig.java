package com.springboot.college.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.springboot.college.props.DatabaseProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Date 2020/4/17 11:35
 * @Created by zhuozuoying
 */
@Configuration
public class DruidConfig {
    @Autowired
    DatabaseProps databaseProps;

    @ConfigurationProperties(prefix = "spring.datasource.druid")
    @Bean
    public DataSource druid() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDbType("com.alibaba.druid.pool.DruidDataSource");
        druidDataSource.setUsername(databaseProps.getUsername());
        druidDataSource.setPassword(databaseProps.getPassword());
        druidDataSource.setUrl(databaseProps.getUrl());
        druidDataSource.setDriverClassName(databaseProps.getDriverClassName());
        return druidDataSource;
    }

    // 配置Druid的监控
    // 配置一个管理后台的Servlet
    @Bean
    public ServletRegistrationBean statViewServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new StatViewServlet());
        // 配置管理后台路径
        servletRegistrationBean.setUrlMappings(Arrays.asList("/druid/*"));
        Map<String, String> initParams = new HashMap<>();
        initParams.put("loginUsername", "root");
        initParams.put("loginPassword", "123456");
        initParams.put("allow", "");// 配置允许访问的路径，默认允许所有访问
        //initParams.put("deny", "192.168.1.150"); // 拒绝那些路径访问
        servletRegistrationBean.setInitParameters(initParams);
        return servletRegistrationBean;
    }
    // 配置一个web监控的filter
    @Bean
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        Map<String, String> initParams = new HashMap<>();
        initParams.put("exclusions", "*.js,*.css,/druid/*"); //忽略哪些请求，不过滤的请求
        filterRegistrationBean.setInitParameters(initParams);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));// 过滤所有请求
        return filterRegistrationBean;
    }

    ///////////////////////////////////////////////////////////////////////////////
//    @Bean
//    public WallFilter wallFilter(){
//        WallFilter wallFilter = new WallFilter();
//        wallFilter.setConfig(wallConfig());
//        return wallFilter;
//    }
//
//    @Bean
//    public WallConfig wallConfig(){
//        WallConfig wallConfig = new WallConfig();
//        wallConfig.setMultiStatementAllow(true);
//        //允许一次执行多条语句
//        wallConfig.setNoneBaseStatementAllow(true);
//        //是否允许非以上基本语句的其他语句
//        wallConfig.setStrictSyntaxCheck(false);
//        //是否进行严格的语法检测
//        return wallConfig;
//    }
//
//    @Bean(name="dataSource")
//    public DataSource dataSource(){
//        return new DruidDataSource();
//    }
//
//    // 配置事物管理器
//    @Bean(name="transactionManager")
//    public DataSourceTransactionManager transactionManager(){
//        return new DataSourceTransactionManager(dataSource());
//    }

}
