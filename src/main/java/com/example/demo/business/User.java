package com.example.demo.business;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User { //SystemUser


    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    String username;
    String password;


    public User(){}
    public User(String username, String password){
        this.password =password;
        this.username =username;
    }
    public User(User user){
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.id = user.getId();
    }

    private Long getId() {
        return id;
    }

    public String getUsername(){return this.username;}
    public String getPassword(){return this.password;}

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString(){
        return "User{"+
                "username="+username+
                "password="+password+
                "}";
    }
}
