package com.alkemy.disney.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.FetchType.LAZY;

@Getter
@Setter
@Entity
@Table(name = "actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actor_id")
    private Long id;
    @Column(name = "image")
    private String image;
    @Column(name = "age")
    private String age;
    @Column(name = "weight")
    private Double weight;
    @Column(name = "story")
    private String story;

    @ManyToMany(mappedBy = "actors" , fetch = LAZY, cascade=PERSIST)
    private List<Movie> movies = new ArrayList<>();
}
