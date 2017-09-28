package com.xgy.myweb.dao.impl;

/**
 * Created by hadoop on 2017/9/28.
 */
//实现类
import com.xgy.myweb.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * Created by zejian on 2017/2/19.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public int addUser() {
        System.out.println("add user ......");
        return 6666;
    }

    @Override
    public void updateUser() {
        System.out.println("update user ......");
    }

    @Override
    public void deleteUser() {
        System.out.println("delete user ......");
    }

    @Override
    public void findUser() {
        System.out.println("find user ......");
    }
}
