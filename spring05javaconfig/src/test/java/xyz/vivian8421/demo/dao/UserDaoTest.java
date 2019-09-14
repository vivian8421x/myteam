package xyz.vivian8421.demo.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xyz.vivian8421.demo.config.AppConfig;

/**
 * @author Vivian8421
 * @title: UserDaoTest
 * @projectName spring05javaconfig
 * @date 2019/9/919:54
 * @description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserDaoTest {
    @Autowired
    private UserDao userDao;
    @Test
    public  void testAdd(){
        userDao.add();
    }
}
