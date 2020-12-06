package cn.bejwt.sesame.controller;

import cn.bejwt.sesame.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "userAccount", produces = "application/json; charset=utf-8")
public class UserAccountController {

    @Autowired
    private UserAccountService userAccountService;

    @RequestMapping("insert")
    public String insertUser(){
        userAccountService.insertUser();
        return "成功";
    }


}
