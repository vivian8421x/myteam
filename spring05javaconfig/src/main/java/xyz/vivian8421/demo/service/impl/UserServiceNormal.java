package xyz.vivian8421.demo.service.impl;

import xyz.vivian8421.demo.dao.UserDao;
import xyz.vivian8421.demo.service.UserService;

/**
 * @author Vivian8421
 * @title: UserServiceNormal
 * @projectName spring05javaconfig
 * @date 2019/9/108:22
 * @description:
 */
public class UserServiceNormal implements UserService {
    private  UserDao userDao;

    public UserServiceNormal() {
        super();
    }

    public UserServiceNormal(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        userDao.add();
    }
}
