package com.example;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomTextMessageService implements MessageService{

    private String[] messages = {"Wiadomosc 1", "Wiadomosc 2", "Wiadomosc 3", "Wiadomosc 4", "Wiadomosc 5", "Wiadomosc 6", "Wiadomosc 7", "Wiadomosc 8", "Wiadomosc 9", "Wiadomosc 10"};

    @Override
    public String getMessage() {
        int random = new Random().nextInt(messages.length);
        return messages[random];
    }
}
