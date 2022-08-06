package com.smbms.dao;

import com.smbms.pojo.Bill;
import com.smbms.pojo.Provider;
import com.smbms.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> selectByUserName(String username);

    User login(Map<String, String> map);

    User selectByIdDuo(Integer id);

//    List<Bill> selectByProductName(String productName);

    int add(User user);

//    int addProvider(Provider provider);

    int updateUser(User user);

    int updateProvider(Provider provider);

    int updateUserPassword(@Param("id") Integer id, @Param("userPassword") String userPassword);

    int deleteByUserId(int id);

//    int deleteByProviderId(@Param("id") int id);

    List<User> selectByRoleId(int id);

//    List<Bill> selectByProductNameBills(String productName);

    List<User> selectByAddress(@Param("id") int id);

//    Provider selectByProviderId(@Param("id")int id);
}
