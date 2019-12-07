package com.groupten.employ.service.impl;

import com.groupten.employ.dao.RootDao;
import com.groupten.employ.service.RootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Autor Lms
 * Time 2019/10/17/017
 */
@Service
public class RootServiceImpl implements RootService {
    @Autowired
    private RootDao rootDao;
    @Override
    public String authenticateRoot(String root_username,String root_password) {
        return rootDao.authenticateRoot(root_username,root_password);
    }
}
