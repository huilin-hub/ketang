package com.java1234.mapper;

import com.java1234.entity.CourseType;

/**
 * 课程类别Mapper接口
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-07-23 23:01
 */
public interface CourseTypeMapper {

    /**
     * 根据id查询实体
     * @param id
     * @return
     */
    public CourseType findById(Integer id);
}
