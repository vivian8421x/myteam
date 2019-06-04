package xyz.vivian8421.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import utils.DbcpUtil;
import xyz.vivian8421.dao.UserDao;
import xyz.vivian8421.entity.User;

import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    QueryRunner qr=new QueryRunner(DbcpUtil.getDataSource());
    @Override
    public int addUser(User u) {
        try {
            return qr.update("insert into user(username,password,sex) values(?,?,?)", u.getUsername(), u.getPassword(), u.getSex());
        } catch (SQLException e) {
            throw  new RuntimeException(e);
        }
    }
}
