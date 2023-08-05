package com.example.spring.security.springsecurity.service;

import com.example.spring.security.springsecurity.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    List<User> getAllUser();

    User showUser(Long id);

    User findByUsername(String firstname);

}
