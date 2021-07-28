package com.kirill.websocketchat.service.impl;

import com.kirill.websocketchat.domain.User;
import com.kirill.websocketchat.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findUserByUsername(s);
        if(user==null){
            throw new UsernameNotFoundException("User with name: '"+s+"' not found");
        }
        Collection<? extends GrantedAuthority> roles =
                user.getRoles().stream().map(
                        r -> new SimpleGrantedAuthority(r.getRole().name())).collect(Collectors.toSet()
                );
        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),roles);
    }
}
