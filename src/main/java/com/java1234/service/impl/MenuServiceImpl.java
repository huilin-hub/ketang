package com.java1234.service.impl;

import com.java1234.entity.Menu;
import com.java1234.mapper.MenuMapper;
import com.java1234.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-07-19 21:28
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> list() {
        return menuMapper.list();
    }
}
