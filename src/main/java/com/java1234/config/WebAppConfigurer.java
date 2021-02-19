package com.java1234.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * webapp配置类
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-07-16 23:44
 */
@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {

    /**
     * 配置虚拟路径映射
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/carouselImages/**").addResourceLocations("file:D:\\carouselImages\\"); // 轮转图片映射
        registry.addResourceHandler("/courseImages/**").addResourceLocations("file:D:\\courseImages\\");  // 课程帖子图片映射
        registry.addResourceHandler("/teacherImages/**").addResourceLocations("file:D:\\teacherImages\\");  //  讲师图片映射
        registry.addResourceHandler("/systemImages/**").addResourceLocations("file:D:\\systemImages\\");  // 系统图片映射
        registry.addResourceHandler("/articleImages/**").addResourceLocations("file:D:\\articleImages\\");  // 自定义帖子图片
    }
}
