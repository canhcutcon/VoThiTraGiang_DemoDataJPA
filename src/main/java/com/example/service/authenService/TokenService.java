package com.example.service.authenService;


import com.example.entity.Authentication.entity.Token;

public interface TokenService {

    Token createToken(Token token);

    Token findByToken(String token);
}
