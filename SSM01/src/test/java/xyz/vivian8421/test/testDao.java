package xyz.vivian8421.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.vivian8421.dao.UserDao;
import xyz.vivian8421.pojo.Admin;

/**
 * @author Vivian8421
 * @title: test
 * @projectName SSM01
 * @date 2019/9/1120:54
 * @description:
 */

public class testDao {
    private ApplicationContext applicationContext;
    @Test
    public void  test() throws Exception {
        applicationContext =new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        UserDao userDao=(UserDao) applicationContext.getBean("UserDao");
        Admin admin= userDao.findUserById(2);
        System.out.println(admin);
    }
}
