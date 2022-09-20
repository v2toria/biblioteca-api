package com.biblioteca.bibliotecaapi.controller;

import com.biblioteca.bibliotecaapi.modelos.Livro;
import com.biblioteca.bibliotecaapi.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LivroController {

    @Autowired
    private LivroService service;

    @GetMapping("/livros")
    public List<Livro> buscarTodosLivros(){
        return service.buscarTodosLivros();
    }


}
