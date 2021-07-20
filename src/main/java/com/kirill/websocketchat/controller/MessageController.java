package com.kirill.websocketchat.controller;

import com.kirill.websocketchat.domain.Message;
import com.kirill.websocketchat.domain.User;
import com.kirill.websocketchat.service.MessageService;
import com.kirill.websocketchat.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/message")
@Data
public class MessageController {

    MessageService messageService;

    @GetMapping("/{id}")
    @Tag(name = "Получить сообщение по id")
    public String getMessageById(@PathVariable Long id){
        return null;
    }

    @GetMapping()
    @Tag(name = "Получить все сообщения")
    public String getAllMessages(){
        return null;
    }

    /*@PutMapping("/save")
    @Tag(name = "Сохранить сообщение")
    public String saveMessage(@RequestBody("message") Message message){
        return null;
    }*/

    @DeleteMapping("/{id}")
    @Tag(name = "Удалить сообщение по id")
    public String deleteMessage(@PathVariable("id") Message messageId){
        return null;
    }
}

