package com.groupten.employ.controller;

import com.groupten.employ.entity.Policy;
import com.groupten.employ.entity.Recommend;
import com.groupten.employ.entity.Recruitment;
import com.groupten.employ.service.PolicyService;
import com.groupten.employ.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Autor Lms
 * Time 2019/9/29/029
 */
@Controller
@RequestMapping("/admins_com")
public class addController {

    @Autowired
    private RecruitService recruitService;

    @Autowired
    private PolicyService policyService;

    @RequestMapping("add")  //进入新增页面
    public String toAdd(){
        return "admin/addRecruitment";
    }

    @RequestMapping("/do_add")      //接受新增页面addRecruitment传过来的值
    public String add(Recruitment recruitment, Model model){   //将前台form传的值
//        System.out.println(recruitment.getRecruit_content());
//        System.out.println(recruitService.addRecruitment(recruitment));
        int result=recruitService.addRecruitment(recruitment);
        model.addAttribute("result",result);
        return "admin/addRecruitment";
    }

    @RequestMapping("/add_policy")
    public String addPolicy(){
        return "root/addPolicy";
    }

    @RequestMapping("/do_add_policy")
    public String do_addPolicy(Policy policy){

        policyService.addOne(policy);
        return "root/addPolicy";
    }
}
