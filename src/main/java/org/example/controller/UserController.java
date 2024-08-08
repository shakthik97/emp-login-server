package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;
    @PostMapping("/auth/login")
    public boolean login(@RequestBody User user){
        return service.login(user);
    }

    @PostMapping("/register")
    public String register(@RequestBody User user){
        return service.register(user);
    }



}
