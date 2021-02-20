package com.java1234.mapper;

import com.java1234.entity.CarouselArticle;

import java.util.List;

/**
 * 轮播帖子Mapper接口
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-07-19 21:26
 */
public interface CarouselArticleMapper {

    /**
     * 查询所有轮播帖子信息
     * @return
     */
    public List<CarouselArticle> list();
}
