package com.way.springbootdemo.controller;

import com.way.springbootdemo.dto.User;
import com.way.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 10/5/2018 15:32
 * @Description:
 */
@Controller
public class ErrorMockController {

    @Autowired
    UserService userService;

    @RequestMapping("/showError")
    @ResponseBody
    List<User> show(@PathParam(value = "flag") Integer flag){
        if(flag==1){
            throw new RuntimeException("测试异常");
        }else{
            return userService.queryAllUsers();
        }
    }
}
