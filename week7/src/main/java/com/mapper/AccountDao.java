package com.mapper;
//用户的持久层接口
import com.domain.Account;
import java.util.List;

public interface AccountDao {
    //查询所有记录
    List<Account>findAll();

    //通过id删除记录
    int deleteByPrimaryKey(String id);

    //插入记录
    int insert(Account record);

    //通过id查找对象
    Account selectByPrimaryKey(String id);

    //更新Account
    int updateByPrimaryKey(String id);

}
