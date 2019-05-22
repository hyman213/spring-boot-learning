package com.hyman.springboot.study.druiddemo.service;

import com.hyman.springboot.study.druiddemo.entity.User;

import java.util.List;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/22 16:11
 * @version： 1.0.0
 */
public interface UserService {
    List<User> queryAllUsers();

}
