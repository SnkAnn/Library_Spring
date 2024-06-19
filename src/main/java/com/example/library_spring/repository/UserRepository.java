package com.example.library_spring.repository;

//import com.example.library_spring.model.Book;
//import com.example.library_spring.model.User;
import com.example.library_spring.proto.UserAndBookAndReviewProto.User;
import com.example.library_spring.proto.UserAndBookAndReviewProto.Book;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.login=:login AND u.password=:password")
    User getUser(@Param("login") String userName,@Param("password") String userPassword);

    @Query("UPDATE User u SET u.imageURL = :image WHERE u.id = :id")
    @Modifying
    @Transactional
    void updateUserProfilePicture(@Param("id") Long userId, @Param("image") String image);

    @Query("UPDATE User u SET u.description = :description WHERE u.id = :id")
    @Modifying
    @Transactional
    void updateUserDescription(@Param("id") Long userId,@Param("description") String newDescription);

    @Query("SELECT u.readBooks FROM User u WHERE u.id=:id")
    List<Book> getUserReadingBooks(@Param("id") Long userId);
}
