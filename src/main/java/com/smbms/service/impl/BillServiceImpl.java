package com.smbms.service.impl;

import com.smbms.dao.BillDao;
import com.smbms.pojo.Bill;
import com.smbms.service.BillService;
import com.smbms.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BillServiceImpl implements BillService {
    private BillDao billDao;

    public BillServiceImpl(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        billDao = sqlSession.getMapper(BillDao.class);
    }


    @Override
    public List<Bill> selectByProductNameBills(String productName) {
        return billDao.selectByProductNameBills(productName);
    }
}
