package xyz.vivian8421.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xyz.vivian8421.demo.dao.UserDao;
import xyz.vivian8421.demo.dao.impl.UserDaoNormal;
import xyz.vivian8421.demo.service.UserService;
import xyz.vivian8421.demo.service.impl.UserServiceNormal;

/**
 * @author Vivian8421
 * @title: AppConfig
 * @projectName spring05javaconfig
 * @date 2019/9/919:49
 * @description:
 */
@Configuration

public class AppConfig {
    @Bean
    public UserDao userDaoNormal() {
        System.out.println("Bean: UserDao userDaoNormal()");
        return new UserDaoNormal();
    }
    @Bean
    public UserService userServiceNormal(UserDao userDao){
//        UserDao userDao= userDaoNormal();
        return  new UserServiceNormal(userDao);
    }
}
