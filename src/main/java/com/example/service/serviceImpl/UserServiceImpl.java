package com.example.service.serviceImpl;

import com.example.entity.Authentication.User;

import java.util.List;

public interface UserServiceImpl {
    public User createUser(User user);
    public List<User> getUserByName(String name);
}
