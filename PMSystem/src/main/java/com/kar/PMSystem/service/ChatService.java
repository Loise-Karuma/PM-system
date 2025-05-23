package com.kar.PMSystem.service;

import com.kar.PMSystem.model.Chat;
import org.springframework.stereotype.Service;


@Service
public interface ChatService {

    Chat createChat(Chat chat);
}
