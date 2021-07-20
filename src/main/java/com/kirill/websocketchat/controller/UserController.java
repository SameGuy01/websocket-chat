package com.kirill.websocketchat.controller;

import com.kirill.websocketchat.domain.User;
import com.kirill.websocketchat.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
@Data
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    private final UserService userService;

    @GetMapping("/save")
    public String userSaveForm(Model model){
        model.addAttribute("user",new User());
        return "edit";
    }

    @GetMapping("/{id}")
    @Tag(name = "Получить пользователя по id")
    public String getUserById(@PathVariable Long id,Model model){
        model.addAttribute("user",userService.findById(id));
        return "userInfo";
    }

    @GetMapping()
    @Tag(name = "Получить всех пользователей")
    public String getAllUsers(){
        return null;
    }

    @PostMapping("/save")
    @Tag(name = "Сохранить или обновить пользователя")
    public String saveUser(@ModelAttribute User user){
        userService.saveUser(user);
        System.out.println("Tyt!");
        return "redirect:/";
    }

    @DeleteMapping("/{id}")
    @Tag(name = "Удалить пользователя по id")
    public String deleteUser(@PathVariable Long id){
        return null;
    }
}
