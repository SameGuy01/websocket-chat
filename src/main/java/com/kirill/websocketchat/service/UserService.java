package com.kirill.websocketchat.service;

import com.kirill.websocketchat.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User findById(Long id);
    List<User> getAllUsers();
    User saveUser(User user);
    void deleteUserById(Long id);
}
