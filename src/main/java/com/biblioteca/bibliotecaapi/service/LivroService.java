package com.biblioteca.bibliotecaapi.service;

import com.biblioteca.bibliotecaapi.modelos.Livro;
import com.biblioteca.bibliotecaapi.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public List<Livro> buscarTodosLivros(){
        return repository.findAll();
    }
}
