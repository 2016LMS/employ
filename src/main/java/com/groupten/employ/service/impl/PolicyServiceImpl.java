package com.groupten.employ.service.impl;

import com.groupten.employ.dao.PolicyDao;
import com.groupten.employ.entity.Policy;
import com.groupten.employ.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Autor Lms
 * Time 2019/10/14/014
 */
@Service
public class PolicyServiceImpl implements PolicyService {

    @Autowired
    private PolicyDao policyDao;

    @Override
    public List<Policy> getAll() {
        return policyDao.selectAll();
    }

    @Override
    public Policy getOne(int poli_id) {
        return policyDao.selectOne(poli_id);
    }

    @Override
    public void addOne(Policy policy) {
        policyDao.insertOne(policy);
    }
}
