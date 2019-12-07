package com.groupten.employ.service;


import com.groupten.employ.entity.Company;
import com.groupten.employ.utility.Page;
import com.groupten.employ.entity.Recruitment;
import com.groupten.employ.vo.RecruitAndCompany;

import java.util.List;

public interface RecruitService {

     int addRecruitment(Recruitment recruitment);

     int getCount();

     List<Recruitment> getRecruitByPage(Page page);

     void setApplyCount(int recruit_id);

     Recruitment getRecruit_detail_gra(int recruit_id);

     Company getCompany(int com_id);

     List<RecruitAndCompany> getRAC(Page page);
}
