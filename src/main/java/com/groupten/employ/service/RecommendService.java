package com.groupten.employ.service;

import com.groupten.employ.entity.Recommend;


import java.util.List;

/**
 * Autor Lms
 * Time 2019/9/17/017
 */


public interface RecommendService {     //接口中的方法默认为public abstract;接口中的变量默认为public static final
     List<Recommend> getList();
}
