package com.kirill.websocketchat.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class RoomNotFoundException extends RuntimeException{
    public RoomNotFoundException(){
        super("Room not found");
    }
}
