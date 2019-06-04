package xyz.vivian8421.service.impl;

import xyz.vivian8421.dao.impl.UserDaoImpl;
import xyz.vivian8421.entity.User;
import xyz.vivian8421.dao.UserDao;
import xyz.vivian8421.service.userService;

public class UserServiceImpl implements userService {
    UserDao userDao =new UserDaoImpl();
    @Override
    public int addUser(User u) {
       int result =userDao.addUser(u);
       return result;
    }
}
