package com.groupten.employ.vo;

import com.groupten.employ.utility.Page;
import com.groupten.employ.entity.Recruitment;

import java.util.List;

/**
 * Autor Lms
 * Time 2019/10/8/008
 */

public class RecruitPage {
    private List<Recruitment> recruitments;
    private List<RecruitAndCompany> rac;       //封装了recruitment和company两个实体类的封装类，可为空
    private Page page;
    private boolean isFirst;
    private boolean isLast;



    public List<Recruitment> getRecruitments() {
        return recruitments;
    }

    public void setRecruitments(List<Recruitment> recruitments) {
        this.recruitments = recruitments;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public boolean getIsFirst() {
        return isFirst;
    }

    public void setFirst(boolean first) {
        isFirst = first;
    }

    public boolean getIsLast() {
        return isLast;
    }

    public void setLast(boolean last) {
        isLast = last;
    }

    public List<RecruitAndCompany> getRac() {
        return rac;
    }

    public void setRac(List<RecruitAndCompany> rac) {
        this.rac = rac;
    }
}
