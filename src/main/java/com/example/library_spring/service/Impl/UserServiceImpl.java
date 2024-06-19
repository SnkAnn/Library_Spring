package com.example.library_spring.service.Impl;

//import com.example.library_spring.model.Book;
//import com.example.library_spring.model.User;

import com.example.library_spring.proto.UserAndBookAndReviewProto;
import com.example.library_spring.repository.UserRepository;
import com.example.library_spring.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public boolean isUserLogin(String userName, String userPassword) {
        UserAndBookAndReviewProto.User user=userRepository.getUser(userName,userPassword);
        if(user==null){
            return false;
        }else{
            return true;
        }
    }
    @Override
    public boolean addNewUser(String userName, String password, String email) {
        userRepository.save(new UserAndBookAndReviewProto.User(userName,password,email,null,"static/images/person.gif",null,null));
        return true;
    }

    @Override
    public UserAndBookAndReviewProto.User getUser(Long userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public void updateUserProfilePicture(Long userId, String image) {
        userRepository.updateUserProfilePicture(userId,image);
    }

    @Override
    public void updateUserDescription(Long userId, String newDescription) {
        userRepository.updateUserDescription(userId,newDescription);
    }

    @Override
    public List<UserAndBookAndReviewProto.Book> getUserReadingBooks(Long userId) {
        return userRepository.getUserReadingBooks(userId);
    }
}
