package com.alkemy.disney.model.entity;

import javax.persistence.*;


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

    public Actor() {
    }

    public Actor(Long id, String image, String age, Double weight, String story) {
        this.id = id;
        this.image = image;
        this.age = age;
        this.weight = weight;
        this.story = story;
    }

    public Long getId() {
        return id;
    }



    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", age='" + age + '\'' +
                ", weight=" + weight +
                ", story='" + story + '\'' +
                '}';
    }
}
