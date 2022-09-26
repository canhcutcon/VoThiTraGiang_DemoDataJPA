package com.example.service;

import com.example.entity.Authentication.User;
import com.example.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceImpl {
    @Autowired
    UserResponsitory userResponsitory;


    @Override
    public User createUser(User user) {
        return userResponsitory.save(user);
    }

    @Override
    public List<User> getUserByName(String name) {
        return null;
    }
}
