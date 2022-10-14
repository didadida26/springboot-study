package com.zjn.springbootstudy.dao;

import com.zjn.springbootstudy.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 在UserDao接口上加@Mapper注解，让SpringBoot给接口创建代理对象
 */
@Mapper
public interface UserDao {
    @Select("select * from user where id = #{id}")
    User findById(Long id);
}
