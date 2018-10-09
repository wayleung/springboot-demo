package com.way.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 10/8/2018 17:41
 * @Description:
 */
@Controller
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping(value = "/{key}",method = RequestMethod.GET)
    @ResponseBody
    public String getKey(@PathVariable(name = "key")String key){
        return stringRedisTemplate.opsForValue().get(key);
    }


    @RequestMapping(value = "/{key}/{value}",method = RequestMethod.PUT)
    @ResponseBody
    public void setKey(@PathVariable(name = "key") String key,@PathVariable(name = "value") String value){
        stringRedisTemplate.opsForValue().set(key,value);
    }



}
