package com.example.service.authentication;

import com.example.authen.UserPrincipal;
import com.example.entity.Authentication.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
