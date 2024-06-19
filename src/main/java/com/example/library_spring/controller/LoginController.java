package com.example.library_spring.controller;

import com.example.library_spring.model.User;
import com.example.library_spring.service.UserService;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
@RestController
@RequestMapping("/")
@AllArgsConstructor
public class LoginController {
    private final UserService userService;

    @PostMapping("/isUserLog/{userName}/{userPassword}")
    public boolean isUserLogin(@PathVariable String userName, @PathVariable String userPassword){
       return userService.isUserLogin(userName,userPassword);
    }



}
