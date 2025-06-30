package com.test.factory;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factory/notification")
public class FactoryNotificationController {

    private final NotificationFactory factory;

    public FactoryNotificationController(NotificationFactory factory) {
        this.factory = factory;
    }

    @PostMapping("/send")
    public ResponseEntity<String> send(@RequestParam String channel, @RequestParam String to) {

        factory.getSender(channel).send(to, "Your verify code is 123456");

        return ResponseEntity.ok("Notification sent via " + channel);
    }

}
