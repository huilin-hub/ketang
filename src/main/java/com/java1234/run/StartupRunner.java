package com.java1234.run;

import com.java1234.service.CarouselArticleService;
import com.java1234.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 项目启动的时候执行器
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-07-19 21:30
 */
@Component("startupRunner")
public class StartupRunner implements CommandLineRunner,ServletContextListener {

    private ServletContext application=null;

    @Autowired
    private MenuService menuService;

    @Autowired
    private CarouselArticleService carouselArticleService;

    @Override
    public void run(String... args) throws Exception {
        this.loadData();
    }

    public void loadData(){
        application.setAttribute("menuList",menuService.list());
        application.setAttribute("carouselArticleList",carouselArticleService.list());
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        application=sce.getServletContext();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
