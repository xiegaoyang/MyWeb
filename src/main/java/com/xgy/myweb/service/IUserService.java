package com.xgy.myweb.service;

import com.xgy.myweb.exception.ApplicationException;
import com.xgy.myweb.model.User;

/**
 * Created by hadoop on 2017/8/31.
 */
public interface IUserService {
    boolean createUser(User user) throws ApplicationException;
    User getUser(String username) throws ApplicationException;
    boolean deleteUser(String username) throws ApplicationException;
    boolean updateUser(User user) throws ApplicationException;
    boolean login(String username, String password) throws ApplicationException;
    boolean logout(String username, String password) throws ApplicationException;
}
