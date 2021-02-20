package com.java1234.entity;

/**
 * 课程实体
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-07-23 22:56
 */
public class Course {

    private Integer id; // 编号

    private String name; // 课程名称

    private String imageName; // 图片名称

    private String type; // 课程类型 vip 会员 free 免费

    private Integer view; // 学习次数

    private String introduction; // 课程介绍

    private String catalog; // 目录

    private String download; // 下载地址

    private String url; // b站学习地址

    private boolean hktj=false; // 好课推荐 true 是 false 否

    private Integer sort1; // 好课推荐排列序号

    private boolean zxkc=false; // 最新课程 true 是 false 否

    private Integer sort2; // 最新课程排列序号

    private boolean mfkc=false; // 免费课程 true 是 false 否

    private Integer sort3; // 免费课程排列序号

    private boolean szkc=false; // 实战课程 true 是 false 否

    private Integer sort4; // 实战课程排列序号

    private CourseType courseType; // 课程类别

    private Teacher teacher; // 授课老师

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

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isHktj() {
        return hktj;
    }

    public void setHktj(boolean hktj) {
        this.hktj = hktj;
    }

    public Integer getSort1() {
        return sort1;
    }

    public void setSort1(Integer sort1) {
        this.sort1 = sort1;
    }

    public boolean isZxkc() {
        return zxkc;
    }

    public void setZxkc(boolean zxkc) {
        this.zxkc = zxkc;
    }

    public Integer getSort2() {
        return sort2;
    }

    public void setSort2(Integer sort2) {
        this.sort2 = sort2;
    }

    public boolean isMfkc() {
        return mfkc;
    }

    public void setMfkc(boolean mfkc) {
        this.mfkc = mfkc;
    }

    public Integer getSort3() {
        return sort3;
    }

    public void setSort3(Integer sort3) {
        this.sort3 = sort3;
    }

    public boolean isSzkc() {
        return szkc;
    }

    public void setSzkc(boolean szkc) {
        this.szkc = szkc;
    }

    public Integer getSort4() {
        return sort4;
    }

    public void setSort4(Integer sort4) {
        this.sort4 = sort4;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
