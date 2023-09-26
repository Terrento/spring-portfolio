package com.example.crud.LpProject.domain.filme;

import jakarta.persistence.*;

@Entity
@Table(name = "films")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getYear_of_release() {
        return year_of_release;
    }

    private String name;
    private String genre;
    private Integer year_of_release;

    public Film(){}

    public Film(DataCreateFilm data){
        this.name = data.name();
        this.year_of_release = data.year_of_release();
        this.genre = data.genre();
    }

    public void updateFilm(DataUpdateFilm data){
        this.name = data.name();
        this.year_of_release = data.year_of_release();
        this.genre = data.genre();
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", year_of_release=" + year_of_release +
                '}';
    }
}
