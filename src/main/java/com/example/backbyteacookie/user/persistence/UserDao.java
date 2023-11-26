package com.example.backbyteacookie.user.persistence;

import com.example.backbyteacookie.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserDao{
    List<User> findAll();
    User findById(long id);
    User create(User user);
    User update(User user);
    void delete(long id);

}
