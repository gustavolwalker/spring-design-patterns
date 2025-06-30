package com.test.observer;

import org.springframework.context.ApplicationEvent;

public class UserCreatedEvent extends ApplicationEvent {

    private final String email;

    public UserCreatedEvent(Object source, String email) {

        super(source);
        this.email = email;
    }

    public String getEmail() {

        return email;
    }
}
