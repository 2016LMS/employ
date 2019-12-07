package com.groupten.employ.service.impl;

import com.groupten.employ.dao.RecruitmentDao;
import com.groupten.employ.entity.Company;
import com.groupten.employ.utility.Page;
import com.groupten.employ.entity.Recruitment;
import com.groupten.employ.service.RecruitService;
import com.groupten.employ.vo.RecruitAndCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Autor Lms
 * Time 2019/10/1/001
 */
@Service
public class RecruitServiceImpl implements RecruitService {

    @Autowired
    private RecruitmentDao recruitmentDao;


    @Override
    public int addRecruitment(Recruitment recruitment) {
        return recruitmentDao.updateRecruitment(recruitment);
    }

    @Override
    public int getCount() {

        return recruitmentDao.totalCount();
    }

    @Override
    public List<Recruitment> getRecruitByPage(Page page) {

        return recruitmentDao.selectRecruitmentByPage(page);
    }

    @Override
    public void setApplyCount(int recruit_id) {

        int count=recruitmentDao.getApply_count(recruit_id);
        recruitmentDao.setApply_count(count);
    }

    @Override
    public Recruitment getRecruit_detail_gra(int recruit_id) {

        return recruitmentDao.selectOneRecruit_gra(recruit_id);
    }

    @Override
    public Company getCompany(int com_id) {
        return recruitmentDao.selectComById(com_id);
    }

    @Override
    public List<RecruitAndCompany> getRAC(Page page) {
        return recruitmentDao.selectRACByPage(page);
    }
}
