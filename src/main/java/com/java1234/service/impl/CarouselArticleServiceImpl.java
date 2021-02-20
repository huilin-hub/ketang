package com.java1234.service.impl;

import com.java1234.entity.CarouselArticle;
import com.java1234.mapper.CarouselArticleMapper;
import com.java1234.service.CarouselArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 轮播帖子Service实现类
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-07-19 21:28
 */
@Service("carouselArticleService")
public class CarouselArticleServiceImpl implements CarouselArticleService {

    @Autowired
    private CarouselArticleMapper carouselArticleMapper;

    @Override
    public List<CarouselArticle> list() {
        return carouselArticleMapper.list();
    }
}
