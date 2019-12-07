package com.groupten.employ.entity;

/**
 * Autor Lms
 * Time 2019/9/12/012
 */
public class JobFair {
    private int fair_id;  //招聘会ID
    private String fair_position;  //地点
    private String fair_contact_person;  //联系人
    private String fair_contact_phone;        //联系电话
    private String fair_tips;  //友情提示
    private String fair_intro;  //介绍

    public int getFair_id() {
        return fair_id;
    }

    public void setFair_id(int fair_id) {
        this.fair_id = fair_id;
    }

    public String getFair_position() {
        return fair_position;
    }

    public void setFair_position(String fair_position) {
        this.fair_position = fair_position;
    }

    public String getFair_contact_person() {
        return fair_contact_person;
    }

    public void setFair_contact_person(String fair_contact_person) {
        this.fair_contact_person = fair_contact_person;
    }

    public String getFair_contact_phone() {
        return fair_contact_phone;
    }

    public void setFair_contact_phone(String fair_contact_phone) {
        this.fair_contact_phone = fair_contact_phone;
    }

    public String getFair_tips() {
        return fair_tips;
    }

    public void setFair_tips(String fair_tips) {
        this.fair_tips = fair_tips;
    }

    public String getFair_intro() {
        return fair_intro;
    }

    public void setFair_intro(String fair_intro) {
        this.fair_intro = fair_intro;
    }
}
