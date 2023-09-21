package com.example.crud.LpProject.domain.filme;

import jakarta.persistence.*;

@Entity
@Table(name = "films")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String genre;
    private Integer year_of_release;

    public Film(){}

    public Film(DataCreateFilm data){
        this.name = data.name();
        this.id = data.Id();
        this.year_of_release = data.year_of_release();
        this.genre = data.genre();
    }

    public Film(DataUpdateFilm data){
        this.name = data.name();
        this.id = data.Id();
        this.year_of_release = data.year_of_release();
        this.genre = data.genre();
    }
}
