package com.kirill.websocketchat.service.impl;

import com.kirill.websocketchat.domain.User;
import com.kirill.websocketchat.repository.UserRepository;
import com.kirill.websocketchat.service.UserService;
import com.kirill.websocketchat.exception.UserNotFoundException;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteUserById(Long id){
        userRepository.deleteById(id);
    }
}
