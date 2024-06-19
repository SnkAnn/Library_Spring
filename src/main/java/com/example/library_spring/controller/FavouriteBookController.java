package com.example.library_spring.controller;

//import com.example.library_spring.model.Book;

import com.example.library_spring.proto.UserAndBookAndReviewProto;
import com.example.library_spring.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class FavouriteBookController {
    private final UserService userService;

    @GetMapping("/userReadingBooks/{userId}")
    public List<UserAndBookAndReviewProto.Book> getUserReadingBooks(@PathVariable Long userId){
        return userService.getUserReadingBooks(userId);
    }

}
