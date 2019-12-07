package com.groupten.employ.service.impl;

import com.groupten.employ.dao.RecommendDao;
import com.groupten.employ.entity.Recommend;
import com.groupten.employ.service.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Autor Lms
 * Time 2019/9/17/017
 */
@Service
public class RecommendServiceImpl implements RecommendService {

    @Autowired
    RecommendDao recommendDao;

    @Override
    public List<Recommend> getList() {
        return recommendDao.selectRecommends();
    }
}
