package com.java1234.service;

import com.java1234.entity.Menu;

import java.util.List;

/**
 * 菜单Service接口
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-07-19 21:28
 */
public interface MenuService {

    /**
     * 查询所有菜单信息
     * @return
     */
    public List<Menu> list();
}
