package com.way.springbootdemo.service.impl;

import com.way.springbootdemo.dao.UserDao;
import com.way.springbootdemo.dto.User;
import com.way.springbootdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *@CacheConfig：缓存配置
 * @Cacheable：应用到读取数据的方法上，即可缓存的方法，如查找方法：先从缓存中读取，如果没有再调
 * 用方法获取数据，然后把数据添加到缓存中。适用于查找
 * key：缓存对象存储在Map集合中的key值，非必需，缺省按照函数的所有参数组合作为key值，若自己配置需使用SpEL表达式，
 * 比如：@Cacheable(key = "#p0")：使用函数第一个参数作为缓存的key值，更多关于SpEL表达式的详细内容可参考官方文档
 * @CachePut：主要针对方法配置，能够根据方法的请求参数对其结果进行缓存，和 @Cacheable 不同的是，它每次都会触发真实方法的调用。适用于更新和插入
 * @CacheEvict：主要针对方法配置，能够根据一定的条件对缓存进行清空。适用于删除
 *
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 10/3/2018 17:27
 * @Description:
 */
//@CacheConfig(cacheNames ={"userCache"})
@CacheConfig(cacheNames ="userCache")
@Service
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @CachePut(key = "#user.id")
    @Override
    public User insertUser(User user) {
        logger.info("插入功能，更新缓存，直接写库, user=" +user);
        return userDao.save(user);
    }

    @CacheEvict(key = "#p0")
    @Override
    public void deleteUserById(Integer id) {
        logger.info("删除功能，删除缓存，直接写库, id=" + id);
        userDao.deleteById(id);
    }
    //这里参数user是实体类 不能用"#p0"  第一个参数
    @CachePut(key = "#user.id")
    @Override
    public User updateUser(User user) {
        logger.info("更新功能，更新缓存，直接写库, user=" +user);
        return userDao.save(user);
    }

//    @Cacheable
    @Override
    public List<User> queryAllUsers() {
        return userDao.findAll();
    }

    @Cacheable(key = "#p0")
    @Override
    public User queryUserById(Integer id) {
        logger.info("查询功能，缓存找不到，直接读库, id=" +id);
        return userDao.findById(id).orElse(null);
    }
}
