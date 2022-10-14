package com.zjn.springbootstudy.dao;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserDaoTest {
    @Resource
    private UserDao userDao;

    @Test
    void findById() {
        System.out.println(userDao.findById(1L));
    }
}