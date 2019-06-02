package com.example.demo.api;

import com.example.demo.business.RegisterService;
import com.example.demo.business.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class RegisterController {
//
//    @Autowired
//    RegisterService registerService;
//
//    @PostMapping
//    public void add(@RequestBody String username, @RequestBody String password){
//        String hashpassword =new BCryptPasswordEncoder().encode(password);//把密码hash后存入数据库
//        registerService.register(new User(username, hashpassword));
//    }
//
//
//}
