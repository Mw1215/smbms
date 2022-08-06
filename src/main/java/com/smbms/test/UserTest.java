package com.smbms.test;

import com.smbms.pojo.Bill;
import com.smbms.pojo.Provider;
import com.smbms.pojo.User;
import com.smbms.service.UserService;
import com.smbms.service.impl.UserServiceImpl;
import org.junit.Test;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserTest {
    private UserService userService=new UserServiceImpl();

    @Test
    public void selectByIdDuo(){
        User user = userService.selectByIdDuo(1);
        System.out.println("user = " + user);
    }


    @Test
    public void selectByUserName(){
        List<User> users = userService.selectByUserName("王");
        for (User user:
             users) {
            System.out.println("user = " + user);
        }
    }


//    @Test
//    public void selectByProductName(){
//        List<Bill> bills = userService.selectByProductName("油");
//        for (Bill bill :
//                bills) {
//            System.out.println("bill = " + bill.getId() + "," + bill.getProductName() + "," + bill.getProviderName() + "," + bill.getTotalPrice() + "," + bill.getCreationDate());
//        }
//    }


    @Test
    public void login(){
        Map<String, String> map = new HashMap<>();
        map.put("userCode","admin");
        map.put("userPassword","");
        User user = userService.login(map);
        System.out.println("user = " + user);
    }


    @Test
    public void add(){
        User user = new User();
        user.setUserCode("test");
        user.setUserName("测试");
        user.setUserPassword("test");
        int result = userService.add(user);
        if (result > 0){
            System.out.println("测试成功");
        }
    }


//    @Test
//    public void addProvider(){
////        long id
//        String proCode = "test";
//        String proName = "test";
//        String proDesc = "test";
//        String proContact = "test";
//        String proPhone = "test";
//        String proAddress = "tset";
//        String proFax = "tset";
//        long createdBy = 1;
//        Date creationDate = new Date(System.currentTimeMillis());
//        long modifyBy = 1;
//        Date modifyDate = new Date(System.currentTimeMillis());
//        Provider provider = new Provider(0,proCode, proName, proDesc, proContact, proPhone, proAddress, proFax, createdBy, creationDate, modifyBy, modifyDate);
//        int i = userService.addProvider(provider);
//        if (i > 0){
//            System.out.println("测试成功");
//        }
//    }

    @Test
    public void updateUser(){
        User user = new User();
        user.setId(35);
        user.setUserCode("miao");
        user.setUserName("Test");
        user.setUserPassword("miao");
        int i = userService.updateUser(user);
        if (i > 0){
            System.out.println("修改成功");
        }
    }

//    @Test
//    public void updateProvider(){
//        long id = 18;
//        String proCode = "test1";
//        String proName = "test1";
//        String proDesc = "test1";
//        String proContact = "test1";
//        String proPhone = "test1";
//        String proAddress = "tset1";
//        String proFax = "tset1";
//        long createdBy = 1;
//        Date creationDate = new Date(System.currentTimeMillis());
//        long modifyBy = 1;
//        Date modifyDate = new Date(System.currentTimeMillis());
//
//        Provider provider = new Provider(id, proCode, proName, proDesc, proContact, proPhone, proAddress, proFax, 0, null, modifyBy, modifyDate);
//
//        int i = userService.updateProvider(provider);
//        if (i > 0){
//            System.out.println("修改成功");
//        }
//    }

    @Test
    public void updateUserPassword(){
        int id = 34;
        String userPassword = "1";

        int i = userService.updateUserPassword(id, userPassword);
        if (i > 0){
            System.out.println("修改成功");
        }
    }

    @Test
    public void deleteByUserId(){
        int id = 34;
        int i = userService.deleteByUserId(id);
        if (i > 0){
            System.out.println("删除成功");
        }
    }

//    @Test
//    public void deleteByProviderId(){
//        int id = 18;
//        int i = userService.deleteByProviderId(id);
//        if (i > 0){
//            System.out.println("删除成功");
//        }
//    }

    @Test
    public void selectByRoleId(){
        int id = 3;
        List<User> users = userService.selectByRoleId(3);
        for (User user :
                users) {
            System.out.println("user = " + user);
        }
    }

//    @Test
//    public void selectByProductNameBills() {
//        String productName = "油";
//        List<Bill> bills = userService.selectByProductNameBills(productName);
//        for (Bill bill :
//                bills) {
//            System.out.println("bill = " + bill);
//        }
//    }

    @Test
    public void selectByAddress(){
        int id = 1;
        List<User> users = userService.selectByAddress(id);
        for (User user :
                users) {
            System.out.println("user = " + user);
        }
    }

//    @Test
//    public void selectByProviderId(){
//        int id = 13;
//        Provider provider = userService.selectByProviderId(13);
//        System.out.println("provider = " + provider);
//    }
}
