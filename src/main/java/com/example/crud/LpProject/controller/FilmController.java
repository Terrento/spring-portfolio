package com.example.crud.LpProject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filmes")
public class FilmController {

    @GetMapping
    public ResponseEntity loadFilms(){
        return ResponseEntity.ok("Just some tests...");
    }
}
