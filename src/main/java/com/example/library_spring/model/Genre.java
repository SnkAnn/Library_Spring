package com.example.library_spring.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Genres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genres_seq")
    @SequenceGenerator(name = "genres_seq", sequenceName = "GENRES_SEQ", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;


}
