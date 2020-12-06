package cn.bejwt.sesame.dao;

import cn.bejwt.sesame.common.config.mybatis.base.CrudMapper;
import cn.bejwt.sesame.entity.UserAccount;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountDao extends CrudMapper<UserAccount> {



}
