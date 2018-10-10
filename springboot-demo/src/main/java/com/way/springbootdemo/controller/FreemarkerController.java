package com.way.springbootdemo.controller;

import com.way.springbootdemo.dto.User;
import com.way.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 10/5/2018 13:37
 * @Description:
 */
@Controller
public class FreemarkerController {

    @Autowired
    UserService userService;

    @RequestMapping("/index")
    public String index(ModelMap map) {
        User user = userService.queryUserById(1);
        map.put("user",user);
        return "index";
    }

    @RequestMapping("/users")
    public String users(ModelMap map) {
        List<User> users = userService.queryAllUsers();
        map.put("users",users);
        return "users";
    }
}
