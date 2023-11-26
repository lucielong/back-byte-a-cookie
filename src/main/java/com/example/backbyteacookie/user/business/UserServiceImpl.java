package com.example.backbyteacookie.user.business;

import com.example.backbyteacookie.user.domain.User;
import com.example.backbyteacookie.user.persistence.UserDao;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(long id) {
        return userDao.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(long id) {
        userDao.delete(id);
    }

    @Override
    @Transactional
    public User create(User user) {
        return userDao.create(user);
    }

    @Override
    @Transactional
    public User update(User user) {
        return userDao.update(user);
    }
}
