package com.kirill.websocketchat.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class MessageNotFoundException extends RuntimeException{
    public MessageNotFoundException(){
        super("Message not found");
    }
}
