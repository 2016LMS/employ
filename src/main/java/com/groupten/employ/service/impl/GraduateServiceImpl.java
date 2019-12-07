package com.groupten.employ.service.impl;

import com.groupten.employ.dao.GraduateDao;
import com.groupten.employ.entity.Graduate;
import com.groupten.employ.service.GraduateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GraduateServiceImpl implements GraduateService {
    @Autowired
    private GraduateDao graduateDao;
    @Override
    public Graduate getGraduateByID(Integer gra_id) {
        return null;
    }

    @Override
    public Integer authenticateGraduate(String gra_username, String gra_password,String role) {
            return graduateDao.authenticateGraduate(gra_username, gra_password,role);
    }
}
