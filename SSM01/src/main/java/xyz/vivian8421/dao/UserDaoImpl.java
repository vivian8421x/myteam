package xyz.vivian8421.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import xyz.vivian8421.pojo.Admin;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

	public Admin findUserById(int id) throws Exception {
		SqlSession sqlSession= this.getSqlSession();
		 Admin admin = sqlSession.selectOne("test.findUserById",id);
		 return admin;
	}
	public List<Admin> findUserByName(String name) throws Exception {
		SqlSession sqlSession= this.getSqlSession();
		 List<Admin> list = sqlSession.selectList("test.findUserByName",name);
		 return list;
	}


	public void insertUser(Admin user) throws Exception {
		SqlSession sqlSession= this.getSqlSession();
		sqlSession.insert("test.insertUser",user);
		sqlSession.commit();
	}

	public void deleteUser(int id) throws Exception {
		SqlSession sqlSession= this.getSqlSession();
		sqlSession.delete("test.delUser",id);
		sqlSession.commit();
	}
	

}
