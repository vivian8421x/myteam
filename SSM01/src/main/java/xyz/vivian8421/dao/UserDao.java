package xyz.vivian8421.dao;

import java.util.List;

import xyz.vivian8421.pojo.Admin;

public interface UserDao {
	public Admin findUserById(int id) throws Exception;
	public List<Admin> findUserByName(String name) throws Exception;
	public void insertUser(Admin user) throws Exception;
	public void deleteUser(int id) throws Exception;
	
}
