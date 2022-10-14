package com.zjn.springbootstudy.service.impl;

import com.zjn.springbootstudy.dao.UserDao;
import com.zjn.springbootstudy.domain.User;
import com.zjn.springbootstudy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }
}
