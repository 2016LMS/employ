package com.groupten.employ.vo;

import com.groupten.employ.entity.Company;
import com.groupten.employ.entity.Recruitment;

/**
 * Autor Lms
 * Time 2019/10/11/011
 */

public class RecruitAndCompany {
    private Recruitment recruitment;
    private Company company;

    public Recruitment getRecruitment() {
        return recruitment;
    }

    public void setRecruitment(Recruitment recruitment) {
        this.recruitment = recruitment;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
