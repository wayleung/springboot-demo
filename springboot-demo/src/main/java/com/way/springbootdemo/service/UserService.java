package com.way.springbootdemo.service;

import com.way.springbootdemo.dto.User;

import java.util.List;
import java.util.Optional;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 10/3/2018 17:23
 * @Description:
 */
public interface UserService {
    User insertUser(User user);

    void deleteUserById(Integer id);

    User updateUser(User user);

    List<User> queryAllUsers();

    User queryUserById(Integer id);
}
