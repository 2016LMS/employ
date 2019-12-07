package com.groupten.employ.controller;

import com.groupten.employ.secuirty.CustomAccountToken;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/form")
    public String loginPage() {
        return "login_regist";
    }
    @RequestMapping("/do")
    public String loginDo(String role, String username, String password, HttpSession httpSession) {
        Subject currentAccount = SecurityUtils.getSubject();
        if (!currentAccount.isAuthenticated()) {
            CustomAccountToken customAccountToken = new CustomAccountToken(role, username, password);
            try {
                currentAccount.login(customAccountToken);
                httpSession.setAttribute("username", customAccountToken.getPrincipal());
                httpSession.setAttribute("role", customAccountToken.getRole());
                if(customAccountToken.getRole().equals("graduate")){
                    return "redirect:/index_gra";
                }else if(role.equals("company")){
                    return "redirect:/index_com?pageNum=1";
                }else{
                    return "root/addPolicy";
                }
            } catch (AuthenticationException e) {
                System.out.println("登录错误"+e.getMessage());
                return "error";
            }
        }
        return "error";
    }

}
