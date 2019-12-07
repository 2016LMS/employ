package com.groupten.employ.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GraduateDao {
    Integer authenticateGraduate(@Param(("gra_username")) String gra_username,
                                 @Param("gra_password") String gra_password,
                                 @Param("role") String role);
}
