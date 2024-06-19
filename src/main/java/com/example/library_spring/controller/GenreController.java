package com.example.library_spring.controller;

//import com.example.library_spring.model.Book;

import com.example.library_spring.proto.UserAndBookAndReviewProto;
import com.example.library_spring.service.BooksService;
import com.example.library_spring.service.SubGenreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping()
@AllArgsConstructor
public class GenreController {
    private final BooksService booksService;
    private final SubGenreService subGenreService;

    @GetMapping("/genreSubGenres/{genreId}")
    public List<String> getSubGenre(@PathVariable Long genreId){
        return subGenreService.getSubGenre(genreId);
    }
    @GetMapping("/genreBooks/{genreId}")
    public List<UserAndBookAndReviewProto.Book> getBooksByGenre(@PathVariable Long genreId){
        return booksService.getBooksByGenre(genreId);
    }

}
