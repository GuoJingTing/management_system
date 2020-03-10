package com.example.management_system.mapper;

import com.example.management_system.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("insert into user(username,password) VALUES(#{username},#{password})")
    void insert(User user);

    @Select("select * from user where id = #{i}")
    User select(Integer i);
}
