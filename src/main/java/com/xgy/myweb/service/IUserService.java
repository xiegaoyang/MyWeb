package com.xgy.myweb.service;

import com.xgy.myweb.model.User;

/**
 * Created by hadoop on 2017/8/31.
 */
public interface IUserService {

    boolean createUser(User user);
    User getUser(String username);
    boolean deleteUser(String username);
    boolean updateUser(User user);

}
