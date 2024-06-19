package com.example.library_spring.controller;

import com.example.library_spring.service.UserService;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@RestController
@RequestMapping()
@AllArgsConstructor
public class RegistrationController {

    private final UserService userService;

     @PostMapping("/addUser/{userName}/{password}/{email}")
     public boolean addNewUser(@PathVariable String userName, @PathVariable String password, @PathVariable String email){
         return userService.addNewUser(userName,password,email);
     }

}
