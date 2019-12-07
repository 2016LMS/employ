package com.groupten.employ.service;

import com.groupten.employ.entity.Graduate;
import org.springframework.stereotype.Service;

@Service
public interface GraduateService {
    Graduate getGraduateByID(Integer gra_id);
    Integer authenticateGraduate(String gra_username, String gra_password, String role);
}
