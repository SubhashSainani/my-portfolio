package com.subhash.devfolio.dao.interfaces;

import java.util.List;

import com.subhash.devfolio.entity.Message;

public interface MessageDAO {
    List<Message> getAllMessages();

    Message findByEmail(String theEmail);

    Message save(Message message);

    void deleteById(Integer id);
}
