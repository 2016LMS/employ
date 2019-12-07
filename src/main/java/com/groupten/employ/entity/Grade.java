package com.groupten.employ.entity;

/**
 * Autor Lms
 * Time 2019/9/18/018
 */
public class Grade {    //学生成绩表
    private int grade_id;
    private int gra_id;     //外键，学生ID
    private int grade_first_year;   //第一学年平均绩点
    private int grade_second_year;  //第二学年平均绩点
    private int grade_third_year;   //第三学年平均绩点
    private int grade_fourth_year;  //第四学年平均绩点
    private int grade_compre;   //综合成绩，四学年平均

    public int getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }

    public int getGra_id() {
        return gra_id;
    }

    public void setGra_id(int gra_id) {
        this.gra_id = gra_id;
    }

    public int getGrade_first_year() {
        return grade_first_year;
    }

    public void setGrade_first_year(int grade_first_year) {
        this.grade_first_year = grade_first_year;
    }

    public int getGrade_second_year() {
        return grade_second_year;
    }

    public void setGrade_second_year(int grade_second_year) {
        this.grade_second_year = grade_second_year;
    }

    public int getGrade_third_year() {
        return grade_third_year;
    }

    public void setGrade_third_year(int grade_third_year) {
        this.grade_third_year = grade_third_year;
    }

    public int getGrade_fourth_year() {
        return grade_fourth_year;
    }

    public void setGrade_fourth_year(int grade_fourth_year) {
        this.grade_fourth_year = grade_fourth_year;
    }

    public int getGrade_compre() {
        return grade_compre;
    }

    public void setGrade_compre(int grade_compre) {
        this.grade_compre = grade_compre;
    }
}
