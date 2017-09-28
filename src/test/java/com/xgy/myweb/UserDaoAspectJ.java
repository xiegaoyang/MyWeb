package com.xgy.myweb;

import com.xgy.myweb.dao.UserDao;
import com.xgy.myweb.service.impl.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hadoop on 2017/9/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations= "classpath:/*.xml")
//@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:spring-redis.xml", "classpath:spring-mybatis.xml", "classpath:spring-aspectj.xml"})
@ContextConfiguration(locations = { "classpath:spring-aspectj.xml"})
public class UserDaoAspectJ {
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @Test
    public void aspectJTest(){
//        userDao.addUser();
        userService.login("123", "123");
    }
}
