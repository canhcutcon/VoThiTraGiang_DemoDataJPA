package com.example.service.authenService;


import com.example.config.UserPrincipal;
import com.example.entity.Authentication.entity.User;


public interface UserService {
    User createUser(User user);

    UserPrincipal findByUsername(String username);
}
