package com.groupten.employ.dao;

import com.groupten.employ.entity.Company;
import com.groupten.employ.utility.Page;
import com.groupten.employ.entity.Recruitment;
import com.groupten.employ.vo.RecruitAndCompany;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Autor Lms
 * Time 2019/10/1/001
 */
@Mapper
@Repository
public interface RecruitmentDao {

    int updateRecruitment(Recruitment recruitment);

    int totalCount();

    List<Recruitment> selectRecruitmentByPage(Page page);      //分页查询

    int  getApply_count(int recruit_id);    //在apply表上查询出所有apply记录

    void setApply_count(int count);      //在recruitment表上设置apply_count属性

    Recruitment selectOneRecruit_gra(int recruit_id);  //学生端查看单个招聘岗位详情

    Company selectComById(int com_id);

    List<RecruitAndCompany> selectRACByPage(Page page);
}
