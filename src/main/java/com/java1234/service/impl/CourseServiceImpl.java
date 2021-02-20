package com.java1234.service.impl;

import com.java1234.entity.Course;
import com.java1234.mapper.CourseMapper;
import com.java1234.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 课程Service实现类
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-07-23 23:09
 */
@Service("courseService")
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> listHktj() {
        return courseMapper.listHktj();
    }
}
