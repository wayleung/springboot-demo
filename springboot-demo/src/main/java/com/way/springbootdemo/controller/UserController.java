package com.way.springbootdemo.controller;

import com.way.springbootdemo.dto.User;
import com.way.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;
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

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    User insertUser(User user){
        return userService.insertUser(user);
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    void deleteUserById(@PathParam(value = "id") Integer id){
        userService.deleteUserById(id);
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @ResponseBody
    User updateUser(User user){
        return userService.updateUser(user);
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @ResponseBody
    List<User> queryAllUsers(){
        return userService.queryAllUsers();
    }


    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @ResponseBody
    User queryUserById(@PathParam(value = "id")Integer id){
        return userService.queryUserById(id);
    }
}