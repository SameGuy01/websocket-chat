package com.kirill.websocketchat.service.impl;

import com.kirill.websocketchat.domain.Message;
import com.kirill.websocketchat.repository.MessageRepository;
import com.kirill.websocketchat.service.MessageService;
import com.kirill.websocketchat.exception.MessageNotFoundException;
import lombok.Data;

import java.util.List;

@Data
public class MessageServiceImpl implements MessageService {
    MessageRepository messageRepository;

    @Override
    public Message findById(Long id) {
        return messageRepository.findById(id).orElseThrow(MessageNotFoundException::new);
    }

    @Override
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    @Override
    public void saveMessage(Message message) {
        messageRepository.save(message);
    }

    @Override
    public void deleteMessageById(Long id) {
        messageRepository.deleteById(id);
    }
}
