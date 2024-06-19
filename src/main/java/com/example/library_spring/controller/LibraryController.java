package com.example.library_spring.controller;

import com.example.library_spring.service.GenreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping()
@AllArgsConstructor
public class LibraryController {
    private final GenreService genreService;

    @GetMapping("/allGenres")
    public List<String> getAllGenres( /*Model model*/){
        //  model.addAttribute("genres",genreService.getAllGenres());
      //return "Library";
        return genreService.getAllGenres();
    }


}
