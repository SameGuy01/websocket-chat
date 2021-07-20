package com.kirill.websocketchat.service.impl;

import com.kirill.websocketchat.domain.Role;
import com.kirill.websocketchat.domain.User;
import com.kirill.websocketchat.domain.enums.Roles;
import com.kirill.websocketchat.repository.RoleRepository;
import com.kirill.websocketchat.repository.UserRepository;
import com.kirill.websocketchat.service.UserService;
import com.kirill.websocketchat.exception.UserNotFoundException;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Data
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User saveUser(User user){
        Set<Role> roles = new HashSet<>();
        Role role = roleRepository.getByRole(Roles.ROLE_ADMIN);
        roles.add(role);
        user.setBlocked(false);
        user.setRoles(roles);
        return userRepository.save(user);
    }

    public void deleteUserById(Long id){
        userRepository.deleteById(id);
    }

}
