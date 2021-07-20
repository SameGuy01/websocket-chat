package com.kirill.websocketchat.controller;

import com.kirill.websocketchat.domain.Room;
import com.kirill.websocketchat.domain.User;
import com.kirill.websocketchat.service.RoomService;
import com.kirill.websocketchat.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/room")
@Data
public class RoomController {

    RoomService roomService;

    @GetMapping("/{id}")
    @Tag(name = "Получить комнату по id")
    public String getRoomById(@PathVariable Long id){
        return null;
    }

    @GetMapping()
    @Tag(name = "Получить все комнаты")
    public String getAllRooms(){
        return null;
    }

    /*@PutMapping("/save")
    @Tag(name = "Сохранить или обновить комнату")
    public String saveRoom(@RequestBody("room") Room room){
        return null;
    }*/

    @DeleteMapping("/{id}")
    @Tag(name = "Удалить комнату по id")
    public String deleteRoom(@PathVariable Room roomId){
        return null;
    }
}
