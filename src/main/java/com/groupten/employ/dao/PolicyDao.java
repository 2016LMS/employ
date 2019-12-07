package com.groupten.employ.dao;

import com.groupten.employ.entity.Policy;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Autor Lms
 * Time 2019/10/14/014
 */
@Mapper
@Repository
public interface PolicyDao {

    List<Policy> selectAll();

    Policy selectOne(int poli_id);

    void insertOne(Policy policy);
}
