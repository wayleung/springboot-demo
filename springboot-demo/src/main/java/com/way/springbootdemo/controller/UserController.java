package com.way.springbootdemo.controller;

import com.way.springbootdemo.dto.User;
import com.way.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 10/3/2018 17:47
 * @Description:
 */
@Controller
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService userService;

//    @Autowired
//    CacheManager cacheManager;


    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    @ResponseBody
    //@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
    //@CrossOrigin("http://localhost:8080")
    //局部跨域
    public User insertUser(User user){
        return userService.insertUser(user);
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteUserById(@PathVariable(name = "id") Integer id){
        userService.deleteUserById(id);
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @ResponseBody
    public User updateUser(User user){
        return userService.updateUser(user);
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @ResponseBody
    public List<User> queryAllUsers(){
        return userService.queryAllUsers();
    }


    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @ResponseBody
    public User queryUserById(@PathVariable(name = "id")Integer id){
        return userService.queryUserById(id);
    }
}