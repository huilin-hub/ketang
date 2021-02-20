package com.java1234.service;

import com.java1234.entity.Course;

import java.util.List;

/**
 * 课程Service接口
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-07-23 23:09
 */
public interface CourseService {

    /**
     * 查询前10条好课推荐课程
     * @return
     */
    public List<Course> listHktj();
}
