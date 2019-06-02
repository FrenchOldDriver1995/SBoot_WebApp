package com.example.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Scratch {
    public static void main(String[] args) {//生成哈希函数
        String hash =new BCryptPasswordEncoder().encode("password");//需要输入的密码
        System.out.println(hash);
    }
}
