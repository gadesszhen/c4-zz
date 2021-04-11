package com.service;

import com.domain.Account;

import java.util.List;

public class AccountService {
    List<Account> findAll(){return null;}

    //通过id删除记录
    void deleteByPrimaryKey(String id){}

    //插入记录
    void insert(Account record){}

    //通过id查找对象
    Account selectByPrimaryKey(String id){return null;}

    //更新Account
    void updateByPrimaryKey(Account record){}

    //转账功能 输入转出id，转入id，转账金额 实现转账
    void transfer(String remitterld,String remitteeld,int money){}
}
