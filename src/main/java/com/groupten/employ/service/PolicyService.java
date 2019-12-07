package com.groupten.employ.service;

import com.groupten.employ.entity.Policy;

import java.util.List;

/**
 * Autor Lms
 * Time 2019/10/14/014
 */
public interface PolicyService {

    void addOne(Policy policy);

    List<Policy> getAll();

    Policy getOne(int Poli_id);
}
