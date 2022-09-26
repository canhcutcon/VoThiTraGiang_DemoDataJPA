package com.example.service.authentication;

import com.example.authen.UserPrincipal;
import com.example.entity.Authentication.User;
import com.example.reponsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public UserPrincipal findByUsername(String username) {
        return null;
    }
}