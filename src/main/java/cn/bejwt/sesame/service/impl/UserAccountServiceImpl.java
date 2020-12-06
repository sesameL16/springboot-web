package cn.bejwt.sesame.service.impl;

import cn.bejwt.sesame.dao.UserAccountDao;
import cn.bejwt.sesame.entity.UserAccount;
import cn.bejwt.sesame.service.UserAccountService;
import cn.bejwt.sesame.util.IdCardGenerator;
import cn.bejwt.sesame.util.RandomValue;
import cn.hutool.Hutool;
import cn.hutool.core.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private UserAccountDao userAccountDao;

    @Override
    public void insertUser() {
        for (int j = 0;j < 50000;j++){
            List<UserAccount> list = new ArrayList<>();
            for (int i = 0;i < 1000;i++){
                UserAccount userAccount = new UserAccount();
                userAccount.setIdcard(IdCardGenerator.generate());
                userAccount.setMobile(RandomValue.getTel());
                userAccount.setCreateTime(new Date());
                userAccount.setUpdateTime(new Date());
                userAccount.setUsername(RandomValue.getChineseName());
                userAccount.setPassword(RandomUtil.randomString(8));
                userAccount.setDelFlag(0);
                list.add(userAccount);
            }
            userAccountDao.insertList(list);
            System.out.println("第"+ j +"次生成");
        }
    }
}
