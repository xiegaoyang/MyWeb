package com.xgy.myweb.controller;

import com.xgy.myweb.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hadoop on 2017/8/30.
 */
@Controller
@RequestMapping("/user")
public class UserController {



    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(User user) {
        System.out.println("register");
        //注册成功，跳转到登录页
        return "redirect:/login";
    }



    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user) {

        //若登陆成功，跳转到导航页
        return "redirect:/navigation";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(String token) {

        return "redirect:/";
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String query(String token) {

        return "settings";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUserInfo(User user, String token) {

        return "setting";
    }









}
