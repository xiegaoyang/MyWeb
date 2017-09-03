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

        if (1 != userMapper.insert(user)) {
            return false;
        }

        return true;
    }

    public User getUser(String username) {
        return null;
    }

    public boolean deleteUser(String username) {
        return false;
    }

    public boolean updateUser(User user) {
        return false;
    }
}
