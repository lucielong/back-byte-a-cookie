package com.example.backbyteacookie.user.business;

import com.example.backbyteacookie.user.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(long id);

    void deleteById(long id);

    User create(User user);

    User update(User user);
}
