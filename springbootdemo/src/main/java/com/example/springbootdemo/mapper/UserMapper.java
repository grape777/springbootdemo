package com.example.springbootdemo.mapper;

import com.example.springbootdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
//表示这个注解是mybatis的mapper类
@Mapper
@Repository
public interface UserMapper {
    List<User> queryUserList();
    User queryUserById(int id);

    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
}
