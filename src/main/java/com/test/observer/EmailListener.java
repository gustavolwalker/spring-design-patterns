package com.test.observer;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmailListener {

    @EventListener
    public void handleUserCreated(UserCreatedEvent event) {

        System.out.println("Email sent to: " + event.getEmail() + " with subject: User registered successfully");
    }
}
