package com.subhash.devfolio.service.interfaces;

import java.util.List;

import com.subhash.devfolio.entity.Message;

public interface MessageService {
    List<Message> getAllMessages();

    Message findByEmail(String theEmail);

    Message save(Message message);

    void deleteById(Integer id);
}