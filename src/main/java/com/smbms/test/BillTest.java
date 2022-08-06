package com.smbms.test;

import com.smbms.pojo.Bill;
import com.smbms.service.BillService;
import com.smbms.service.impl.BillServiceImpl;
import org.junit.Test;

import java.util.List;

public class BillTest {
    private BillService billService = new BillServiceImpl();

    @Test
    public void selectByProductNameBills(){
        List<Bill> bills = billService.selectByProductNameBills("油");
        for (Bill bill :
                bills) {
            System.out.println("bill = " + bill);
        }
    }
}
