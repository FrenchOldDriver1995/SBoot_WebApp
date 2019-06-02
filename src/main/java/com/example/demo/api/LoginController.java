package com.example.demo.api;

import com.example.demo.business.RegisterService;
import com.example.demo.business.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    RegisterService registerService;

//    @PostMapping("/addAccount")
//    public void add(@RequestBody String name, @RequestBody String pwd){
//        String hashPwd =new BCryptPasswordEncoder().encode(pwd); //password hashed
//        registerService.registerAccount(new User(name, hashPwd));
//    }

    @GetMapping("/login")
    public String loginPage(){
        return "/login.html";
    }
}