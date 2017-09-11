package com.xgy.myweb;

import com.xgy.myweb.model.User;
import com.xgy.myweb.service.impl.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by hadoop on 2017/9/10.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"/system-dao.xml"})
//@ContextConfiguration(locations = "classpath:spring-redis.xml")
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:spring-redis.xml", "classpath:spring-mybatis.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Before
    public void before() {
        System.out.println("before");
        assertNotNull("userService is null", userService);
    }

    @After
    public void after() {
        System.out.println("after");
    }


    @Test
    public void getUser() throws Exception {

        User user = userService.getUser("12");
        System.out.println(user.toString());

    }

    @Test
    public void login() {
        String username = "12";
        String password = "12";

        userService.login(username, password);
    }



}