package com.smbms.service;

import com.smbms.pojo.Bill;
import com.smbms.pojo.Provider;
import com.smbms.pojo.User;


import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> selectByUserName(String username);

    User login(Map<String, String> map);

    User selectByIdDuo(Integer id);

//    List<Bill> selectByProductName(String productName);

    int add(User user);

//    int addProvider(Provider provider);

    int updateUser(User user);

//    int updateProvider(Provider provider);

    int updateUserPassword( Integer id, String userPassword);

    int deleteByUserId(int id);

//    int deleteByProviderId(int id);

    List<User> selectByRoleId(int id);

//    List<Bill> selectByProductNameBills(String productName);

    List<User> selectByAddress(int id);

//    Provider selectByProviderId(int id);

}
