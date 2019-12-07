package com.groupten.employ.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Autor Lms
 * Time 2019/10/17/017
 */
@Repository
@Mapper
public interface RootDao {
    public String authenticateRoot(@Param("root_username")String username,
                                   @Param("root_password")String password);
}
