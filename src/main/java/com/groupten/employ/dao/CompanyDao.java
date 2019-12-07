package com.groupten.employ.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CompanyDao {
    Integer authenticateCompany(@Param("com_username") String com_username,
                                @Param("com_password") String com_password,
                                @Param("com_role") String role);
}
