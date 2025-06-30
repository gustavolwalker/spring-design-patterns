package com.test.singleton;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/singleton/notification")
public class SingletonNotificationController {

    private final EmailService emailService;

    public SingletonNotificationController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/done")
    public ResponseEntity<String> notifyUserDone(@RequestParam String email) {
        emailService.sendEmail(email, "Process notification", "Hi User, your task is done!");

        return ResponseEntity.ok("Notification sent to " + email);
    }
}
