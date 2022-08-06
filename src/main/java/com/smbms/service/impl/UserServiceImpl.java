package com.smbms.service.impl;

import com.smbms.dao.UserDao;
import com.smbms.pojo.Bill;
import com.smbms.pojo.Provider;
import com.smbms.pojo.User;
import com.smbms.service.UserService;
import com.smbms.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

//    private static  sqlSession;


    public UserServiceImpl(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        userDao = sqlSession.getMapper(UserDao.class);
    }

    @Override
    public List<User> selectByUserName(String username) {
        return userDao.selectByUserName(username);
    }

    @Override
    public User login(Map<String, String> map) {
        return userDao.login(map);
    }

    @Override
    public User selectByIdDuo(Integer id) {
        return userDao.selectByIdDuo(id);
    }

//    @Override
//    public List<Bill> selectByProductName(String productName) {
//        return userDao.selectByProductName(productName);
//    }

    @Override
    public int add(User user) {
        return userDao.add(user);
    }

//    @Override
//    public int addProvider(Provider provider) {
//        return userDao.addProvider(provider);
//    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

//    @Override
//    public int updateProvider(Provider provider) {
//        return userDao.updateProvider(provider);
//    }

    @Override
    public int updateUserPassword(Integer id, String userPassword) {
        return userDao.updateUserPassword(id, userPassword);
    }

    @Override
    public int deleteByUserId(int id) {
        return userDao.deleteByUserId(id);
    }

//    @Override
//    public int deleteByProviderId(int id) {
//        return userDao.deleteByProviderId(id);
//    }

    @Override
    public List<User> selectByRoleId(int id) {
        return userDao.selectByRoleId(id);
    }

//    @Override
//    public List<Bill> selectByProductNameBills(String productName) {
//        return userDao.selectByProductNameBills(productName);
//    }

    @Override
    public List<User> selectByAddress(int id) {
        return userDao.selectByAddress(id);
    }

//    @Override
//    public Provider selectByProviderId(int id) {
//        return userDao.selectByProviderId(id);
//    }
}
