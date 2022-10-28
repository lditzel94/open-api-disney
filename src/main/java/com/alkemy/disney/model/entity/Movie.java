package com.alkemy.disney.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


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

    public Movie() {
    }

    public Movie(Long movieId, String image, String title, String creationDate, int rating) {
        this.movieId = movieId;
        this.image = image;
        this.title = title;
        this.creationDate = creationDate;
        this.rating = rating;
    }

    public Long getMovieId() {
        return movieId;
    }



    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", image='" + image + '\'' +
                ", title='" + title + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", rating=" + rating +
                '}';
    }
}
