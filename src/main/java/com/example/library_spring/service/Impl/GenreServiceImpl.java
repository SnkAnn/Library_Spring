package com.example.library_spring.service.Impl;

//import com.example.library_spring.model.Genre;

import com.example.library_spring.proto.GenreProto;
import com.example.library_spring.repository.GenreRepository;
import com.example.library_spring.service.GenreService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class GenreServiceImpl implements GenreService {

private final GenreRepository genreRepository;


    @Override
    public List<String> getAllGenres() {
        List<String> genreList=new ArrayList<>();
        for(GenreProto.Genre genre:genreRepository.findAll()){
            genreList.add(genre.getName());
        }
        return genreList;
    }
}
