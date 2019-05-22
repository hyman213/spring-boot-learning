package com.hyman.springboot.study.druiddemo.dao;

import com.hyman.springboot.study.druiddemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/22 16:10
 * @version： 1.0.0
 */
@Mapper
public interface UserDao {

    @Select("SELECT id, name FROM user")
    List<User> queryAllUsers();
}
