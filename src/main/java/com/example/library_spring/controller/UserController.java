package com.example.library_spring.controller;

//import com.example.library_spring.model.User;

import com.example.library_spring.proto.UserAndBookAndReviewProto;
import com.example.library_spring.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/user/{userId}")
    public UserAndBookAndReviewProto.User getUser(@PathVariable Long userId){
       return userService.getUser(userId);
    }
    @PostMapping("/updateUserImage/{userId}/{image}")
    public void updateUserProfilePicture(@PathVariable Long userId, @PathVariable String image){
        userService.updateUserProfilePicture( userId, image);
    }
    @PostMapping("/updateUserDescription/{userId}/{newDescription}")
    public void updateUserDescription(@PathVariable Long userId, @PathVariable String newDescription){
        userService.updateUserDescription(userId,newDescription);
    }


}
