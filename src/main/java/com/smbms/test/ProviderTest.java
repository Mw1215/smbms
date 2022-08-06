package com.smbms.test;

import com.smbms.pojo.Provider;
import com.smbms.service.ProviderService;
import com.smbms.service.impl.ProviderServiceImpl;
import org.junit.Test;

import java.sql.Date;

public class ProviderTest {
    private ProviderService providerService = new ProviderServiceImpl();
    @Test
    public void addProvider(){
        String proCode = "test";
        String proName = "test";
        String proDesc = "test";
        String proContact = "test";
        String proPhone = "test";
        String proAddress = "tset";
        String proFax = "tset";
        long createdBy = 1;
        Date creationDate = new Date(System.currentTimeMillis());
        long modifyBy = 1;
        Date modifyDate = new Date(System.currentTimeMillis());
        Provider provider = new Provider(0,proCode, proName, proDesc, proContact, proPhone, proAddress, proFax, createdBy, creationDate, modifyBy, modifyDate);
        int i = providerService.addProvider(provider);
        if (i > 0)
            System.out.println("添加成功");
    }

    @Test
    public void updateProvider(){
        long id = 19;
        String proCode = "test1";
        String proName = "test1";
        String proDesc = "test1";
        String proContact = "test1";
        String proPhone = "test1";
        String proAddress = "tset1";
        String proFax = "tset1";
        long createdBy = 1;
        Date creationDate = new Date(System.currentTimeMillis());
        long modifyBy = 1;
        Date modifyDate = new Date(System.currentTimeMillis());

        Provider provider = new Provider(id, proCode, proName, proDesc, proContact, proPhone, proAddress, proFax, 0, null, modifyBy, modifyDate);

        int i = providerService.updateProvider(provider);
        if (i > 0)
            System.out.println("修改成功");
    }

    @Test
    public void deleteByProviderId(){
        int id = 20;
        int i = providerService.deleteByProviderId(id);
        if (i > 0){
            System.out.println("删除成功");
        }
    }

    @Test
    public void selectByProviderId(){
        int id = 2;
        Provider provider = providerService.selectByProviderId(id);
        System.out.println("provider = " + provider);
    }


}
