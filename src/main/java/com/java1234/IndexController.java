package com.java1234;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页或者url跳转控制器
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-07-13 22:40
 */
@Controller
public class IndexController {

    /**
     * 登录请求
     * @return
     */
    @RequestMapping("/login")
    public String  login(){
        return "login";
    }
}
