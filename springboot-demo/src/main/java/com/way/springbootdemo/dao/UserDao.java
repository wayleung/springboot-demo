package com.way.springbootdemo.dao;

import com.way.springbootdemo.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 10/3/2018 17:16
 * @Description:
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
