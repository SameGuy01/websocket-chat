package com.kirill.websocketchat.controller;

import com.kirill.websocketchat.domain.User;
import com.kirill.websocketchat.service.UserService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
@Data
public class AuthController {
    private final UserService userService;

    @GetMapping("")
    public String authPage(Model model){
        model.addAttribute("user",new User());
        return "auth";
    }

    @PostMapping("/register")
    public String userRegister(@ModelAttribute User user){
        userService.saveUser(user);
        return "index";
    }
}
