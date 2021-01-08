package com.java1234.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-07-13 22:35
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 配置用户认证
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .passwordEncoder(new BCryptPasswordEncoder()).withUser("java1234").password(new BCryptPasswordEncoder().encode("123456"))
                .roles("ADMIN");
    }

    /**
     * 配置请求授权
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().cors().disable().headers().disable()
                .authorizeRequests()
                .antMatchers("/","/alipay/**","/weixinpay/**","/myCenter","/toPayVip","/qqLogin","/userLogout","/weixinconnect/**","/main","/weixinLogin","/connect","/images/**","/loginDialog.html","/carouselImages/**","/courseImages/**","/teacherImages/**","/systemImages/**","/js/**","/layui/**","/css/**","/courseImages/**","/articleImages/**","/course/**","/article/**","/wap/**").permitAll() // 配置不需要身份认证的请求地址
                .anyRequest().authenticated() // 其他所有访问路径需要身份认证
                .and()
                .formLogin()
                .loginPage("/login") // 指定登录请求地址
                .defaultSuccessUrl("/admin") // 登录成功后的默认跳转页面
                .permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("/login")
                .permitAll();
    }
}
