package com.java1234.mapper;

import com.java1234.entity.Menu;

import java.util.List;

/**
 * 菜单Mapper接口
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-07-19 21:26
 */
public interface MenuMapper {

    /**
     * 查询所有菜单信息
     * @return
     */
    public List<Menu> list();
}
