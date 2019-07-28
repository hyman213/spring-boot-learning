package com.hyman.springboot.study.druiddemo.controller;

import com.hyman.springboot.service.CustomerService;
import com.hyman.springboot.study.druiddemo.entity.User;
import com.hyman.springboot.study.druiddemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/22 16:11
 * @version： 1.0.0
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<User> queryAll() {
        List<User> users = userService.queryAllUsers();
        return users;
    }

    // 手写spring-boot-starter测试
    @Autowired
    private CustomerService customerService;

    @GetMapping("/name")
    public String name(){
        return customerService.getName();
    }


}
