package com.test.observer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/observer/user")
public class ObserverUserController {

    private final UserService userService;

    public ObserverUserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/create")
    public ResponseEntity<String> createUser(String email) {

        userService.register(email);

        return ResponseEntity.ok("User created successfully with email: " + email);
    }
}
