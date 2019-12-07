package com.groupten.employ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author Lms
 * Time 2019/9/11/011
 */
@Controller
public class PageRedirectController {
    @RequestMapping("/a")
    public String index() {
        return "index";
    }
//    @RequestMapping("/{pageName}")
//    public String page(@PathVariable("pageName") String pageName){
//        return pageName;
//    }

}
