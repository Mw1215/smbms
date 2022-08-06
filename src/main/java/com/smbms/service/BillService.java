package com.smbms.service;

import com.smbms.pojo.Bill;

import java.util.List;

public interface BillService {

    List<Bill> selectByProductNameBills(String productName);
}
