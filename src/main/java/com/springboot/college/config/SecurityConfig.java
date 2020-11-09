package com.springboot.college.config;

import com.springboot.college.common.JwtAuthError;
import com.springboot.college.filter.JwtAuthFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @Description TODO
 * @Date 2020/4/7 14:48
 * @Created by zhuozuoying
 */
@Configuration
@EnableWebSecurity// 添加security过滤器

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // 权限不足错误信息处理，包含认证错误与鉴权错误处理
    @Autowired
    private JwtAuthError myAuthErrorHandler;

    // 密码明文加密方式配置
    @Bean
    public PasswordEncoder myEncoder() {
        return new BCryptPasswordEncoder();
    }

    // jwt校验过滤器，从http头部Authorization字段读取token并校验
    @Bean
    public JwtAuthFilter myAuthFilter() throws Exception {
        return new JwtAuthFilter();
    }

    // 认证用户时用户信息加载配置
//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("admin").password(myEncoder().encode("12345")).roles("ADMIN")
//                .and()
//                .withUser("user").password(myEncoder().encode("12345")).roles("USER");
//    }

    // 配置http，包含权限配置
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http

                // 基于token，不需要csrf
                .csrf().disable()

                // 基于token，不需要session
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()

                // 设置myUnauthorizedHandler处理认证失败、鉴权失败
                .exceptionHandling().authenticationEntryPoint(myAuthErrorHandler).accessDeniedHandler(myAuthErrorHandler).and()

                // 下面开始设置权限
                .authorizeRequests()

                // 需要登录  /** 是代表所有接口
                .antMatchers("/jwt/hello").authenticated();

        //添加jwt过滤器，JWT过滤器在用户名密码认证过滤器之前
        http.addFilterBefore(myAuthFilter(), UsernamePasswordAuthenticationFilter.class);
    }
    // 获取AuthenticationManager（认证管理器），可以在其他地方使用
    @Bean(name="authenticationManagerBean")
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }


    /*//不需要验证的接口，除了下面配置的其余接口都必须要先获取token
    @Override
    public void configure(WebSecurity web) throws Exception {
        // Allow swagger to be accessed without authentication
//        web.ignoring().antMatchers("/**");
        web.ignoring().antMatchers("/auth/login");
        web.ignoring().antMatchers("/actuator/health");
        web.ignoring().antMatchers("/favicon.ico");
    }*/
}
