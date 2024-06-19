package com.example.library_spring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "SubGenres")
public class SubGenre {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sub_genres_seq")
    @SequenceGenerator(name = "sub_genres_seq", sequenceName = "SUB_GENRES_SEQ", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "genre_id", referencedColumnName = "id")
    private Genre genre;

}
