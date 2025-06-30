package com.test.observer;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final ApplicationEventPublisher publisher;

    public UserService(ApplicationEventPublisher publisher) {

        this.publisher = publisher;
    }

    public void register(String email) {

        System.out.println("Registering user with email: " + email);
        System.out.println("User registered successfully.");

        publisher.publishEvent(new UserCreatedEvent(this, email));
    }
}
