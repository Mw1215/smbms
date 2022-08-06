package com.smbms.dao;

import com.smbms.pojo.Bill;

import java.util.List;

public interface BillDao {
//    根据商品名称进行模糊查询
    List<Bill> selectByProductNameBills(String productName);
}
