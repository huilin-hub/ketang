package com.java1234.mapper;

import com.java1234.entity.Teacher;

/**
 * 讲师Mapper接口
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-07-23 23:01
 */
public interface TeacherMapper {

    /**
     * 根据id查询实体
     * @param id
     * @return
     */
    public Teacher findById(Integer id);
}
