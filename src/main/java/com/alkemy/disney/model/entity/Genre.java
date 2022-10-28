package com.alkemy.disney.model.entity;

import javax.persistence.*;

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

    public Genre() {
    }

    public Genre(Long genreId, String name, String image) {
        this.genreId = genreId;
        this.name = name;
        this.image = image;
    }

    public Long getGenreId() {
        return genreId;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genreId=" + genreId +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
