package com.subhash.devfolio.service.interfaces;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.subhash.devfolio.entity.User;

public interface UserService extends UserDetailsService {
    User findByUserName(String userName);
}