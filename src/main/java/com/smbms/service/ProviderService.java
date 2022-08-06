package com.smbms.service;

import com.smbms.pojo.Provider;
import org.apache.ibatis.annotations.Param;

public interface ProviderService {

    int addProvider(Provider provider);

    int updateProvider(Provider provider);

    int deleteByProviderId(int id);

    Provider selectByProviderId(int id);
}
