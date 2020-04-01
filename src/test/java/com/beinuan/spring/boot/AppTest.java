package com.beinuan.spring.boot;

import com.beinuan.spring.boot.bean.User;
import com.beinuan.spring.boot.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;


@SpringBootTest
public class AppTest {


    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testInsert(){
        userMapper.insertUser(new User(null, "admin", "123456", "北暖", "beinuan@qq.com"));
    }


    @Test
    public void testGetAll(){
        List<User> userList = userMapper.getAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testConnection() throws SQLException {
        System.out.println(dataSource.getConnection());
    }
}
