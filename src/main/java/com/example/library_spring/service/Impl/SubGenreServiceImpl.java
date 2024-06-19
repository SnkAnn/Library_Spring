package com.example.library_spring.service.Impl;

//import com.example.library_spring.model.Genre;
//import com.example.library_spring.model.SubGenre;
import com.example.library_spring.proto.SubGenreProto;
import com.example.library_spring.repository.SubGenreRepository;
import com.example.library_spring.service.SubGenreService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class SubGenreServiceImpl implements SubGenreService {

    private final SubGenreRepository subGenreRepository;
    @Override
    public List<String> getSubGenre(Long genreId) {
        List<String> subGenreList=new ArrayList<>();
        for( SubGenreProto.SubGenre subGenre:subGenreRepository.findById(genreId).stream().toList()){
             subGenreList.add(subGenre.getName());
        }
        return subGenreList;
    }
}
