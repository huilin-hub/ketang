package com.java1234.entity;

/**
 * 友情链接实体类
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-07-12 23:29
 */
public class Link {

    private Integer id; // 编号

    private String name; // 链接名称

    private String url; // 链接地址

    private Integer sort; // 排列序号

    private String remark; // 描述

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
