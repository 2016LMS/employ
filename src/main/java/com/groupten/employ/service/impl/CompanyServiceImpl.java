package com.groupten.employ.service.impl;

import com.groupten.employ.dao.CompanyDao;
import com.groupten.employ.entity.Company;
import com.groupten.employ.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyDao companyDao;
    @Override
    public Company getCompanyByName(String com_name) {
        return null;
    }

    @Override
    public Integer authenticateCompany(String com_username, String com_password,String com_role) {
        return companyDao.authenticateCompany(com_username, com_password, com_role);
    }
}
