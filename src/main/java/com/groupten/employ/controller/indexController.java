package com.groupten.employ.controller;

import com.groupten.employ.entity.Company;
import com.groupten.employ.entity.Policy;
import com.groupten.employ.service.PolicyService;
import com.groupten.employ.utility.Page;
import com.groupten.employ.entity.Recommend;
import com.groupten.employ.entity.Recruitment;
import com.groupten.employ.service.RecommendService;
import com.groupten.employ.service.RecruitService;
import com.groupten.employ.vo.RecruitAndCompany;
import com.groupten.employ.vo.RecruitPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Autor Lms
 * Time 2019/9/11/011
 */
@Controller
@RequestMapping("/")
public class indexController {

    @Autowired
    RecommendService recommendService;

    @Autowired
    RecruitService recruitService;

    @Autowired
    private PolicyService policyService;

    @RequestMapping("/index_gra")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.sendRedirect("/index.html");


        ModelAndView mav=new ModelAndView("index_graduate");
        List<Recommend> re=recommendService.getList();

        mav.addObject("res",re);
        return mav;
    }

    @RequestMapping("/index_com")
    public ModelAndView sortPagerArticle(int pageNum) {		//链接中传递的参数由pageNum接收

        Page page=new Page();
        int count= recruitService.getCount();
        page.setTotalCount(count);
        page.setPageNum(pageNum);
        page.setPageSize(5);
        List<Recruitment> recruits=recruitService.getRecruitByPage(page);
        RecruitPage recruitPage=new RecruitPage();
        if (pageNum==1){
            recruitPage.setFirst(true);
        }
        if (pageNum==page.getPageTotal()){
            recruitPage.setLast(true);
        }
        recruitPage.setPage(page);
        recruitPage.setRecruitments(recruits);
        ModelAndView mav=new ModelAndView();
        mav.addObject("res",recruitPage);
        mav.setViewName("index_company");
        return mav;
    }

    @RequestMapping("/admin")
    public String admins(){
//        System.out.println(id);
        return "index_test";
    }

    @RequestMapping("/recruit_list")
    public ModelAndView recruitList(int pageNum){

        Page page=new Page();
        int count= recruitService.getCount();
        page.setTotalCount(count);
        page.setPageNum(pageNum);
        page.setPageSize(5);
        List<RecruitAndCompany> rac=recruitService.getRAC(page);
        RecruitPage recruitPage=new RecruitPage();
        if (pageNum==1){
            recruitPage.setFirst(true);
        }
        if (pageNum==page.getPageTotal()){
            recruitPage.setLast(true);
        }
        recruitPage.setPage(page);
        recruitPage.setRac(rac);
//        System.out.println(rac.get(1).getRecruitment().getRecruit_content());
        ModelAndView mav=new ModelAndView();
        mav.addObject("res",recruitPage);
        mav.setViewName("recruit_list");
        return mav;
    }

    @RequestMapping("/recruit_gra")
    public ModelAndView recruit(int recruit_id){
        Recruitment re= recruitService.getRecruit_detail_gra(recruit_id);
        int id=re.getCom_id();
        Company com=recruitService.getCompany(id);
        RecruitAndCompany rac=new RecruitAndCompany();
        rac.setCompany(com);
        rac.setRecruitment(re);
        ModelAndView mav=new ModelAndView();
        mav.addObject("rac",rac);
        mav.setViewName("recruit_detail_gra");
        return mav;
    }

    @RequestMapping("/policy_list")
    public ModelAndView policyList(){
        List<Policy> policies= policyService.getAll();
        ModelAndView mav=new ModelAndView();
        mav.setViewName("policy_list");
        mav.addObject("pos",policies);
        return mav;
    }

    @RequestMapping("/policy_detail")
    public ModelAndView policyDetail(int poli_id){
        Policy policy = policyService.getOne(poli_id);
        ModelAndView mav=new ModelAndView();
        mav.setViewName("policy_detail");
        mav.addObject("po",policy);
        return mav;
    }

    @RequestMapping("/homePage")
    public String home_com(){

        return "admin/homePage_com";
    }



}
