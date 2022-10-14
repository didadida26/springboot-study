package com.zjn.springbootstudy.controller;

import com.zjn.springbootstudy.domain.User;
import com.zjn.springbootstudy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/books")
public class BookController {

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping("/{id}")
    public User getById(@PathVariable Long id){
        return userService.findById(id);
    }


}
