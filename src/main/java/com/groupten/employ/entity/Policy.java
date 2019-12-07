package com.groupten.employ.entity;


import java.util.Date;

/**
 * Autor Lms
 * Time 2019/9/12/012
 */
public class Policy {   //政策表
    private int poli_id;
    private String title;
    private String author;  //作者
    private Date poli_post_time;
    private String poli_content;

    public int getPoli_id() {
        return poli_id;
    }

    public void setPoli_id(int poli_id) {
        this.poli_id = poli_id;
    }

    public Date getPoli_post_time() {
        return poli_post_time;
    }

    public void setPoli_post_time(Date poli_post_time) {
        this.poli_post_time = poli_post_time;
    }

    public String getPoli_content() {
        return poli_content;
    }

    public void setPoli_content(String poli_content) {
        this.poli_content = poli_content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
