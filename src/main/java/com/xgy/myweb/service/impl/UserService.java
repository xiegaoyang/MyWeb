package com.xgy.myweb.service.impl;

import com.xgy.myweb.dao.UserMapper;
import com.xgy.myweb.model.User;
import com.xgy.myweb.service.IUserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * Created by hadoop on 2017/8/31.
 */
@Service
public class UserService implements IUserService {

    private final Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private UserMapper userMapper;

    public boolean createUser(User user) {

        user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));

        if (1 != userMapper.insert(user)) {
            return false;
        }

        return true;
    }

    public User getUser(String username) {
        User user = new User();
        user.setUsername(username);
        return userMapper.selectOne(user);
    }

    public boolean deleteUser(String username) {
        return false;
    }

    public boolean updateUser(User user) {
        return false;
    }

    public boolean login(String username, String password) {

        System.out.println(username);
        Long result = redisTemplate.opsForList().leftPush("login", username);
        System.out.println("result : " + result);

        return true;
    }

    public boolean logout(String username, String password) {
        return true;
    }

}
