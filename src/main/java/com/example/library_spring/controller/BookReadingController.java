package com.example.library_spring.controller;

import com.example.library_spring.service.BooksService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
@AllArgsConstructor
public class BookReadingController {
    private final BooksService booksService;

    @GetMapping("/textOfBook/{bookId}")
    public String getTextOfBook(@PathVariable  Long bookId){
       return booksService.getTextOfBook(bookId);
    }

}
