package com.example.demo.repository;

import com.example.demo.business.User;

public interface UserRepository {

    boolean verify(String name, String psw); //验证是否有用户功能。。但是Security好像可以直接验证了

    void add(User user);//添加用户功能
}
