package com.kirill.websocketchat.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(){
        super("User not found exception");
    }
}
