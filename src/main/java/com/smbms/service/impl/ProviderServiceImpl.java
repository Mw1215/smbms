package com.smbms.service.impl;

import com.smbms.dao.ProviderDao;
import com.smbms.pojo.Provider;
import com.smbms.service.ProviderService;
import com.smbms.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class ProviderServiceImpl implements ProviderService {
    private ProviderDao providerDao;

    public ProviderServiceImpl(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        providerDao = sqlSession.getMapper(ProviderDao.class);
    }

    @Override
    public int addProvider(Provider provider) {
        return providerDao.addProvider(provider);
    }

    @Override
    public int updateProvider(Provider provider) {
        return providerDao.updateProvider(provider);
    }

    @Override
    public int deleteByProviderId(int id) {
        return providerDao.deleteByProviderId(id);
    }

    @Override
    public Provider selectByProviderId(int id) {
        return providerDao.selectByProviderId(id);
    }
}
