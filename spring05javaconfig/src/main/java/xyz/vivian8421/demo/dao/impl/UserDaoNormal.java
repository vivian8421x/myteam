package xyz.vivian8421.demo.dao.impl;

import org.springframework.stereotype.Repository;
import xyz.vivian8421.demo.dao.UserDao;

/**
 * @author Vivian8421
 * @title: UserDaoNormal
 * @projectName spring05javaconfig
 * @date 2019/9/919:44
 * @description:
 */

public class UserDaoNormal implements UserDao {
    public void add(){
        System.out.println("UserDaoNormal add");
        }
}
