package com.groupten.employ.entity;

/**
 * Autor Lms
 * Time 2019/9/12/012
 */
public class Company {
    private int com_id;
    private String username;
    private String password;
    private String com_name; //公司名
    private String com_leader;  //领导人
    private String com_position;    //公司位置
    private String com_intro;   //公司简介
    private String com_img;       //公司照片
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getCom_id() {
        return com_id;
    }

    public void setCom_id(int com_id) {
        this.com_id = com_id;
    }

    public String getCom_name() {
        return com_name;
    }

    public void setCom_name(String com_name) {
        this.com_name = com_name;
    }

    public String getCom_leader() {
        return com_leader;
    }

    public void setCom_leader(String com_leader) {
        this.com_leader = com_leader;
    }

    public String getCom_position() {
        return com_position;
    }

    public void setCom_position(String com_position) {
        this.com_position = com_position;
    }

    public String getCom_intro() {
        return com_intro;
    }

    public void setCom_intro(String com_intro) {
        this.com_intro = com_intro;
    }

    public String getCom_img() {
        return com_img;
    }

    public void setCom_img(String com_img) {
        this.com_img = com_img;
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
