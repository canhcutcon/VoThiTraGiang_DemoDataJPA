package com.example.service.authentication;

import com.example.entity.Authentication.Token;
import com.example.spring_boot_api_jwt_ad.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
