package com.way.springbootdemo.service.impl;

import com.way.springbootdemo.dao.UserDao;
import com.way.springbootdemo.dto.User;
import com.way.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 10/3/2018 17:27
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public User insertUser(User user) {
        return userDao.save(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userDao.deleteById(id);
    }

    @Override
    public User updateUser(User user) {
        return userDao.save(user);
    }

    @Override
    public List<User> queryAllUsers() {
        return userDao.findAll();
    }

    @Override
    public User queryUserById(Integer id) {
        return userDao.findById(id).orElse(null);
    }
}
