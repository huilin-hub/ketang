package com.java1234.mapper;

import com.java1234.entity.Course;

import java.util.List;

/**
 * 课程Mapper接口
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-07-23 23:01
 */
public interface CourseMapper {

    /**
     * 查询前10条好课推荐课程
     * @return
     */
    public List<Course> listHktj();
}
