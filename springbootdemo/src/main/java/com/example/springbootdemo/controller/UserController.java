package com.example.springbootdemo.controller;


import com.example.springbootdemo.mapper.UserMapper;
import com.example.springbootdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        List<User> userList = userMapper.queryUserList();
        for (User user:userList){
            System.out.println(user);
        }
        return userList;
    }
    @GetMapping(value = "test")
    public String test(){
        return "测试接口连接成功";
    }
    //添加一个用户
    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(3,"小王","345"));
        return "addUser-ok";
    }
    //修改一个用户
    @GetMapping("/updateUser")
    public String updateUser(){
        userMapper.updateUser(new User(3,"小张","567"));
        return "updateUser-ok";
    }
    //删除一个用户
    @GetMapping("/deleteUser")
    public String deleteUser(){
//        userMapper.updateUser(new User(3,"小张","567"));
        userMapper.deleteUser(3);
        return "updateUser-ok";
    }
}
