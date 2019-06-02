package com.example.demo.business;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="username")
    String username;
    @Column(name="password")
    String password;


    public User(){}
    public User(String username, String password){
        this.password =password;
        this.username =username;
    }

    public String getUsername(){return this.username;}
    public String getPassword(){return this.password;}


    @Override
    public String toString(){
        return "User{"+
                "username="+username+
                "password="+password+
                "}";
    }
}
