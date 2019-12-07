package com.groupten.employ.entity;

import java.util.Date;

/**
 * Autor Lms
 * Time 2019/9/12/012
 */
public class Graduate {
    private int gra_id;
    private String role;   //权限
    private String username;    //用户名
    private String password;
    private String gra_name;    //毕业生姓名
    private String gra_honor;   //荣誉
    private int gra_age;    //年龄
    private int gra_year;   //毕业年份
    private Date gra_birthday;  //生日
    private String gra_img;   //图片
    private int uni_id;     //大学ID
    private int coll_id;    //学院ID
    private int grade_id;   //年级ID
    private String gra_major;   //所修专业

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGra_major() {
        return gra_major;
    }

    public void setGra_major(String gra_major) {
        this.gra_major = gra_major;
    }

    public int getGra_id() {
        return gra_id;
    }

    public void setGra_id(int gra_id) {
        this.gra_id = gra_id;
    }

    public String getGra_name() {
        return gra_name;
    }

    public void setGra_name(String gra_name) {
        this.gra_name = gra_name;
    }

    public String getGra_honor() {
        return gra_honor;
    }

    public void setGra_honor(String gra_honor) {
        this.gra_honor = gra_honor;
    }

    public int getGra_age() {
        return gra_age;
    }

    public void setGra_age(int gra_age) {
        this.gra_age = gra_age;
    }

    public int getGra_year() {
        return gra_year;
    }

    public void setGra_year(int gra_year) {
        this.gra_year = gra_year;
    }

    public Date getGra_birthday() {
        return gra_birthday;
    }

    public void setGra_birthday(Date gra_birthday) {
        this.gra_birthday = gra_birthday;
    }

    public String getGra_img() {
        return gra_img;
    }

    public void setGra_img(String gra_img) {
        this.gra_img = gra_img;
    }

    public int getUni_id() {
        return uni_id;
    }

    public void setUni_id(int uni_id) {
        this.uni_id = uni_id;
    }

    public int getColl_id() {
        return coll_id;
    }

    public void setColl_id(int coll_id) {
        this.coll_id = coll_id;
    }

    public int getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
