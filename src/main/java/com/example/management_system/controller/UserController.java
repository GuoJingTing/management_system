package com.example.management_system.controller;


import com.example.management_system.bean.User;
import com.example.management_system.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/main")
    public String insert(@RequestParam(value = "username")String username,@RequestParam(value = "password") String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userMapper.insert(user);
        System.out.println(user);
        return "hello";
    }
}
