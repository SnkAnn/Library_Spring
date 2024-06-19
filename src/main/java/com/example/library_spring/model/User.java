package com.example.library_spring.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Users")
public class User {
    public User(String userName, String password, String email, String description, String imageURL, Book currentBook, List<Book> readBooks) {
        this.login=userName;
        this.password=password;
        this.mail=email;
        this.description=description;
        this.imageURL=imageURL;
        this.currentBook=currentBook;
        this.readBooks=readBooks;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
    @SequenceGenerator(name = "users_seq", sequenceName = "USERS_SEQ", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "mail")
    private String mail;

    @Column(name = "description")
    private String description;

    @Column(name = "imageURL")
    private String imageURL;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Book currentBook;

    @ManyToMany
    @JoinTable(
            name = "user_books", // имя таблицы связывания
            joinColumns = @JoinColumn(name = "user_id"), // внешний ключ для текущей сущности
            inverseJoinColumns = @JoinColumn(name = "book_id") // внешний ключ для связанной сущности
    )
      private List<Book> readBooks;



}
