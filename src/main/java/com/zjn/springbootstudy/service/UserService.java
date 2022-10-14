package com.zjn.springbootstudy.service;

import com.zjn.springbootstudy.domain.User;

public interface UserService {
    User findById(Long id);
}
