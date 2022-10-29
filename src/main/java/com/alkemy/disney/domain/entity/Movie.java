package com.alkemy.disney.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;
@Getter
@Setter
@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Long movieId;
    @Column(name = "image")
    private String image;
    @Column(name = "title")
    private String title;
    @Column(name = "creation_date")
    private String creationDate;
    @Column(name = "rating")
    private int rating;
    @ManyToOne(fetch = LAZY, optional = false)
    @JoinColumn(name = "genre_id", nullable = false)
    @JsonIgnore
    private Genre genre;

    @JoinTable(name = "movie_actors",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    @ManyToMany(fetch = LAZY)
    @JsonIgnore
    private List<Actor> actors = new ArrayList<>();

}
