package com.beinuan.spring.boot.mapper;

import com.beinuan.spring.boot.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper  // 加mapper注解后springboot才会扫描到接口
public interface UserMapper {


    // 查询所有记录
    List<User> getAll();

    // 添加一条记录
    void insertUser(User user);

}
