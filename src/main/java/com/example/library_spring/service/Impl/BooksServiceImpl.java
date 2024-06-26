package com.example.library_spring.service.Impl;

//import com.example.library_spring.model.Book;

import com.example.library_spring.proto.UserAndBookAndReviewProto;
import com.example.library_spring.repository.BooksRepository;
import com.example.library_spring.service.BooksService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class BooksServiceImpl implements BooksService {

    private final BooksRepository booksRepository;
    @Override
    public String getTextOfBook(Long bookId) {
        return booksRepository.getTextOfBook(bookId);
    }

    @Override
    public void updateBookText(Long bookId, String bookText) {
        booksRepository.updateBookText(bookId,bookText);
    }

    @Override
    public void createBook(UserAndBookAndReviewProto.Book book) {
        booksRepository.save(book);
    }


    @Override
    public List<UserAndBookAndReviewProto.Book> getBooksByGenre(Long genreId) {
      return  booksRepository.findByGenreId(genreId);
    }

    @Override
    public List<UserAndBookAndReviewProto.Book> getBooksBySubGenre(Long subGenreId) {
        return booksRepository.findBySubGenreId(subGenreId);
    }

    @Override
    public List<UserAndBookAndReviewProto.Book> getBooksByAuthor(Long userId) {
        return booksRepository.getBooksByAuthor(userId);
    }
}
