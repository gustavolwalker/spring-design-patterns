package com.design.patterns.factory;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class NotificationFactory {

    private final Map<String, NotificationSender> senderMap;

    public NotificationFactory(Map<String, NotificationSender> senderMap) {
        this.senderMap = senderMap;
    }

    public NotificationSender getSender(String channel) {
        return senderMap.get(channel);
    }

}
