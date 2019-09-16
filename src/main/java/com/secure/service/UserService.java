package com.secure.service;

import java.util.List;

import com.secure.model.User;

public interface UserService {
    List<User> getAll();

    User getOne(String email);

    void add(User user);
}
