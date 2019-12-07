package com.groupten.employ.service;

import com.groupten.employ.entity.Company;
import org.springframework.stereotype.Service;

@Service
public interface CompanyService {
    Company getCompanyByName(String com_name);
    Integer authenticateCompany(String com_username, String com_password, String role);
}
