package com.biblioteca.bibliotecaapi.controller;

import com.biblioteca.bibliotecaapi.modelos.Autor;
import com.biblioteca.bibliotecaapi.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AutorController {

    @Autowired
    private AutorService service;

    @GetMapping("/autores")
    public List<Autor> buscarTodosAutores(){
        return service.buscarTodosAutor();
    }


}
