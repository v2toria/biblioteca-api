package com.biblioteca.bibliotecaapi.controller;

import com.biblioteca.bibliotecaapi.dto.LivroDto;
import com.biblioteca.bibliotecaapi.modelos.Livro;
import com.biblioteca.bibliotecaapi.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LivroController {

    @Autowired
    private LivroService service;

    @GetMapping("/livros")
    public List<Livro> buscarTodosLivros(){
        return service.buscarTodosLivros();
    }

    @PostMapping("/livros")
    @ResponseStatus(HttpStatus.CREATED)
    public Livro cadastrarLivro(@RequestBody LivroDto livroDto){
        return service.cadastrarLivros(livroDto);
    }




}
