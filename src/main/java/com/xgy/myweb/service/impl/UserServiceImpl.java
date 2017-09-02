package com.xgy.myweb.service.impl;

import com.xgy.myweb.dao.UserMapper;
import com.xgy.myweb.model.User;
import com.xgy.myweb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hadoop on 2017/8/31.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public boolean createUser(User user) {

//        userMapper.insertUser(user);
        userMapper.insert(user);

        return true;
    }

    public User getUser(String username) {
        User user = new User();
        user.setUsername(username);
        return userMapper.selectOne(user);
    }

    public boolean deleteUser(String username) {
        return true;
    }

    public boolean updateUser(User user) {

        if (1 != userMapper.updateByPrimaryKey(user)) {
            return false;
        }

        return true;
    }
}
