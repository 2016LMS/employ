package com.groupten.employ.entity;

/**
 * Autor Lms
 * Time 2019/9/12/012
 */
public class Recruitment {
    private int recruit_id;
    private int com_id; //招聘公司
    private String recruit_name;  //岗位名称
    private String recruit_requires;  //要求
    private String recruit_treat;  //待遇
    private String recruit_position;  //地址
    private String recruit_content;  //招聘岗位内容
    private int is_recruit_active;
    private int apply_count;    //申请人数


    public int getApply_count() {
        return apply_count;
    }

    public void setApply_count(int apply_count) {
        this.apply_count = apply_count;
    }

    public String getRecruit_requires() {
        return recruit_requires;
    }

    public void setRecruit_requires(String recruit_requires) {
        this.recruit_requires = recruit_requires;
    }

    public String getRecruit_treat() {
        return recruit_treat;
    }

    public void setRecruit_treat(String recruit_treat) {
        this.recruit_treat = recruit_treat;
    }

    public int getRecruit_id() {
        return recruit_id;
    }

    public void setRecruit_id(int recruit_id) {
        this.recruit_id = recruit_id;
    }

    public int getCom_id() {
        return com_id;
    }

    public void setCom_id(int com_id) {
        this.com_id = com_id;
    }

    public String getRecruit_name() {
        return recruit_name;
    }

    public void setRecruit_name(String recruit_name) {
        this.recruit_name = recruit_name;
    }

    public String getRecruit_position() {
        return recruit_position;
    }

    public void setRecruit_position(String recruit_position) {
        this.recruit_position = recruit_position;
    }

    public String getRecruit_content() {
        return recruit_content;
    }

    public void setRecruit_content(String recruit_content) {
        this.recruit_content = recruit_content;
    }

    public int getIs_recruit_active() {
        return is_recruit_active;
    }

    public void setIs_recruit_active(int is_recruit_active) {
        this.is_recruit_active = is_recruit_active;
    }
}
