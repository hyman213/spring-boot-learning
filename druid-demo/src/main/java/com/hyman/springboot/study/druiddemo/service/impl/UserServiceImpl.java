package com.hyman.springboot.study.druiddemo.service.impl;

import com.hyman.springboot.study.druiddemo.dao.UserDao;
import com.hyman.springboot.study.druiddemo.entity.User;
import com.hyman.springboot.study.druiddemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/22 16:11
 * @version： 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryAllUsers() {
        List<User> users = userDao.queryAllUsers();
        return users;
    }
}
