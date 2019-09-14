package xyz.vivian8421.mapper;

import xyz.vivian8421.pojo.Admin;

import java.util.List;

/**
 * @Author Vivian8421
 * @Time 2019年8月31日 下午3:24:36
 * @Version 1.0
 * Description:mapper接口，相当于dao接口，用户管理
 *
 * 开发规范：
 * 1.mapper.xml中namespace为mapper接口的全限定名
 * <mapper namespace="xyz.vivian8421.mapper.UserMapper">
 * 2.XXXmapper.java的方法名和XXXmapper.xml的statement的id一致
 *   且输入参数parameterType 返回值resultType 类型一致
 * <select id="findUserById" parameterType="int" resultType="xyz.vivian8421.pojo.Admin">
 * public Admin findUserById(int id) throws Exception;
 *
 * 当符合规范时，mybatis会自动生成代理对象并对sqlSession.增删改查  进行统一生成
 */
    public interface UserMapper {
        public Admin findUserById(int id) throws Exception;
        public List<Admin> findUserByName(String name) throws Exception;
        public void insertUser(Admin user) throws Exception;
        public void deleteUser(int id) throws Exception;

    }
