package com.biblioteca.bibliotecaapi.controller;

import com.biblioteca.bibliotecaapi.dto.AutorDto;
import com.biblioteca.bibliotecaapi.modelos.Autor;
import com.biblioteca.bibliotecaapi.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AutorController {

    @Autowired
    private AutorService service;

    @GetMapping("/autores")
    public List<Autor> buscarTodosAutores(){
        return service.buscarTodosAutor();
    }

    @PostMapping("/autores")
    @ResponseStatus(HttpStatus.CREATED)
    public Autor cadastrarAutor(@RequestBody AutorDto autorDto){
        var autor = new Autor(autorDto);
        return service.cadastrarAutor(autor);
    }

    @GetMapping("/autores/{id}")
    public Optional<Autor> buscarAutorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }





}
