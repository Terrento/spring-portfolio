package com.example.crud.LpProject.controller;

import com.example.crud.LpProject.domain.filme.DataCreateFilm;
import com.example.crud.LpProject.domain.filme.Film;
import com.example.crud.LpProject.domain.filme.FilmRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/films")
public class FilmController {
    @Autowired
    private FilmRepository respository;

    @GetMapping
    public ResponseEntity loadFilms(){
        var allFilms = respository.findAll();
        return ResponseEntity.ok(allFilms);
    }

    @PostMapping
    public ResponseEntity registerFilm(@RequestBody @Valid DataCreateFilm data){
        Film film = new Film(data);
        respository.save(film);
        System.out.println(data);
        return ResponseEntity.ok().build();
    }
}
