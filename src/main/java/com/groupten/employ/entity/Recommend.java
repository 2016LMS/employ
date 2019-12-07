package com.groupten.employ.entity;

import java.util.Date;

/**
 * Autor Lms
 * Time 2019/9/17/017
 */
public class Recommend {        //首页推荐模块展示的内容

    private int rec_id;
    private String rec_title;
    private String rec_img;
    private String rec_text;
    private Date rec_post_time;
    private String author;

    public int getRec_id() {
        return rec_id;
    }

    public void setRec_id(int rec_id) {
        this.rec_id = rec_id;
    }

    public String getRec_title() {
        return rec_title;
    }

    public void setRec_title(String rec_title) {
        this.rec_title = rec_title;
    }

    public String getRec_img() {
        return rec_img;
    }

    public void setRec_img(String rec_img) {
        this.rec_img = rec_img;
    }

    public String getRec_text() {
        return rec_text;
    }

    public void setRec_text(String rec_text) {
        this.rec_text = rec_text;
    }

    public Date getRec_post_time() {
        return rec_post_time;
    }

    public void setRec_post_time(Date rec_post_time) {
        this.rec_post_time = rec_post_time;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
