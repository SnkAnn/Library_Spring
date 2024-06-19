package com.example.library_spring.repository;

//import com.example.library_spring.model.SubGenre;

import com.example.library_spring.proto.SubGenreProto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubGenreRepository extends JpaRepository<SubGenreProto.SubGenre, Long> {
}
