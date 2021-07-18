package com.kirill.websocketchat.controller;

import com.kirill.websocketchat.domain.User;
import com.kirill.websocketchat.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
@Data
public class UserController {

    UserService userService;

    @GetMapping("/{id}")
    @Tag(name = "Получить пользователя по id")
    public String getUserById(@PathVariable Long id){
        return null;
    }

    @GetMapping()
    @Tag(name = "Получить всех пользователей")
    public String getAllUsers(){
        return null;
    }

    @PutMapping("/save")
    @Tag(name = "Сохранить или обновить пользователя")
    public String saveUser(@RequestBody("user") User user){
        return null;
    }

    @DeleteMapping("/{id}")
    @Tag(name = "Удалить пользователя по id")
    public String deleteUser(@PathVariable Long id){
        return null;
    }
}
