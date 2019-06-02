package com.example.demo.business;

import com.example.demo.repository.UserRepository;

public class RegisterServiceImpl implements RegisterService{

    private UserRepository userRepository;

    public RegisterServiceImpl(UserRepository userRepository){this.userRepository=userRepository; }

    @Override
    public void registerAccount(User user) {
        userRepository.add(user);
    }
}
