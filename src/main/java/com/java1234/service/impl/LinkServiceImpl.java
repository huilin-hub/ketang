package com.java1234.service.impl;

import com.java1234.mapper.LinkMapper;
import com.java1234.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-07-12 23:35
 */
@Service("linkService")
public class LinkServiceImpl implements LinkService {

    @Autowired
    private LinkMapper linkMapper;

}
