package com.example.auth.controller;

import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
}
