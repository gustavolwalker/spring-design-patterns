package com.design.patterns.factory;

import org.springframework.stereotype.Service;

@Service("email")
public class EmailSender implements NotificationSender{

    @Override
    public void send(String to, String message) {

        System.out.println("Sending email to: " + to);
        System.out.println("Message: " + message);
    }
}
