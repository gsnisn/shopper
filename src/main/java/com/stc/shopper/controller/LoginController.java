package com.stc.shopper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class LoginController {

    @GetMapping
    public String sayHello() {
        return "Time on the server is " + LocalDateTime.now();
    }
}
