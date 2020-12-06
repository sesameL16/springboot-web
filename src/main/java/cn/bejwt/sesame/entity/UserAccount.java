package cn.bejwt.sesame.entity;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class UserAccount {

    @Id
    private Integer id;

    private String username;

    private String password;

    private String mobile;

    private String idcard;

    private Date createTime;

    private Date updateTime;

    private Integer delFlag;

}
