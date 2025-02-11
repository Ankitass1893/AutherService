package com.org.librarySyatem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String nationality;
    public Author() {}

    public Author(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }
//    @ManyToMany(mappedBy = "authors")
//    private Set<Book> books = new HashSet<>();
}

