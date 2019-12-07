package com.groupten.employ.dao;

import com.groupten.employ.entity.Recommend;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * Autor Lms
 * Time 2019/9/17/017
 */
@Mapper
@Repository
public interface RecommendDao {
    List<Recommend> selectRecommends();
}
