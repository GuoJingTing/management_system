package com.example.management_system;

import com.example.management_system.bean.User;
import com.example.management_system.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ManagementSystemApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    void test1(){
        User user = userMapper.select(1);
        System.out.println(user.getUsername());
    }
}
