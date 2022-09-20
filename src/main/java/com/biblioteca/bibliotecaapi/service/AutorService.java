package com.biblioteca.bibliotecaapi.service;

import com.biblioteca.bibliotecaapi.modelos.Autor;
import com.biblioteca.bibliotecaapi.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository repository;

    public List<Autor> buscarTodosAutor(){
        return repository.findAll();
    }
}
