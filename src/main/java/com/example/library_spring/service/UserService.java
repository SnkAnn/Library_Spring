package com.example.library_spring.service;

//import com.example.library_spring.model.Book;
//import com.example.library_spring.model.User;

import com.example.library_spring.proto.UserAndBookAndReviewProto;

import java.util.List;

public interface UserService {
    boolean isUserLogin(String userName, String userPassword);

    boolean addNewUser(String userName, String password, String email);

    UserAndBookAndReviewProto.User getUser(Long userId);

    void updateUserProfilePicture(Long userId, String image);

    void updateUserDescription(Long userId, String newDescription);

    List<UserAndBookAndReviewProto.Book> getUserReadingBooks(Long userId);
}
