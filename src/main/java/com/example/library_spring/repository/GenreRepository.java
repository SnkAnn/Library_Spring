package com.example.library_spring.repository;

//import com.example.library_spring.model.Genre;
import com.example.library_spring.proto.GenreProto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<GenreProto.Genre, Long> {
}
