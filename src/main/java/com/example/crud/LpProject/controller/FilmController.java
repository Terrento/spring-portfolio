package com.example.crud.LpProject.controller;

import com.example.crud.LpProject.domain.filme.DataCreateFilm;
import com.example.crud.LpProject.domain.filme.DataUpdateFilm;
import com.example.crud.LpProject.domain.filme.Film;
import com.example.crud.LpProject.domain.filme.FilmRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/films")
public class FilmController {
    @Autowired
    private FilmRepository repository;

    @GetMapping
    @Transactional
    public List<Film> loadFilms(){
        return repository.findAll();
    }

    @PostMapping
    @Transactional
    public Film registerFilm(@RequestBody @Valid DataCreateFilm data){
        Film film = new Film(data);

        return repository.save(film);
    }

    @PutMapping("/update/{id}")
    @Transactional
    public Film updateFilm(@PathVariable("id") Long id, @RequestBody @Valid DataUpdateFilm data){
        Film film = repository.findById(id).get();
        film.updateFilm(data);
        repository.save(film);
        return film;
    }

    @DeleteMapping("/delete/{id}")
    @Transactional
    public boolean deleteFilm(@PathVariable("id") Long id, @RequestBody @Valid DataUpdateFilm data){
        if (!repository.findById(id).equals(Optional.empty())){
            repository.deleteById(id);
            return true;
        } else{
            return false;
        }
    }
}
