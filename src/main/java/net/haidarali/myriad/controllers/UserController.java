package net.haidarali.myriad.controllers;

import net.haidarali.myriad.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class UserController {

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @GetMapping("/user")
    public ResponseEntity<User> user(@RequestBody User user) {
        logger.info(user.toString());
        return ResponseEntity.accepted().body(user);
    }

    @PostMapping("/update-user")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        logger.info(user.toString());
        user.setUsername(user.getUsername());
        return ResponseEntity.accepted().body(user);
    }
}
