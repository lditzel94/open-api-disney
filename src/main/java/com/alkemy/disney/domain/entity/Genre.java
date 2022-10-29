package com.alkemy.disney.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "genre")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_id")
    private Long genreId;
    @Column(name = "name")
    private String name;
    @Column(name = "image")
    private String image;

    @OneToMany(mappedBy = "genre")
    private List<Movie> movies;

}
