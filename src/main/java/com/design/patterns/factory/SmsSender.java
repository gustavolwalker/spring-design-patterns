package com.design.patterns.factory;

import org.springframework.stereotype.Service;

@Service("sms")
public class SmsSender implements NotificationSender {

    @Override
    public void send(String to, String message) {

        System.out.println("Sending SMS to: " + to);
        System.out.println("Message: " + message);
    }
}
