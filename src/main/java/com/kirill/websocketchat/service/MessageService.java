package com.kirill.websocketchat.service;

import com.kirill.websocketchat.domain.Message;
import com.kirill.websocketchat.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {
    Message findById(Long id);
    List<Message> getAllMessages();
    void saveMessage(Message user);
    void deleteMessageById(Long id);
}
