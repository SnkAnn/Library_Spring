package com.example.library_spring.service;

//import com.example.library_spring.model.Book;

import com.example.library_spring.proto.UserAndBookAndReviewProto;

import java.util.List;

public interface BooksService {

    String getTextOfBook(Long bookId);

    void updateBookText(Long bookId, String bookText);

    void createBook(UserAndBookAndReviewProto.Book book);


    List<UserAndBookAndReviewProto.Book> getBooksByGenre(Long genreId);

    List<UserAndBookAndReviewProto.Book> getBooksBySubGenre(Long subGenreId);

    List<UserAndBookAndReviewProto.Book> getBooksByAuthor(Long userId);
}
