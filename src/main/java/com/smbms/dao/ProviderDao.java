package com.smbms.dao;

import com.smbms.pojo.Provider;
import org.apache.ibatis.annotations.Param;

public interface ProviderDao {
//    添加provider
    int addProvider(Provider provider);
//  根据id修改provider
    int updateProvider(Provider provider);

//    根据id删除provider
    int deleteByProviderId(int id);
//    通过供应商id查询订单
    Provider selectByProviderId(@Param("id")int id);
}
