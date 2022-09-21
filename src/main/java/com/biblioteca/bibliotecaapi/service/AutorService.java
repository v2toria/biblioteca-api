package com.biblioteca.bibliotecaapi.service;

import com.biblioteca.bibliotecaapi.modelos.Autor;
import com.biblioteca.bibliotecaapi.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository repository;

    public List<Autor> buscarTodosAutor(){
        return repository.findAll();
    }

    public Autor cadastrarAutor(Autor autor){
        return repository.save(autor);
    }

    public Optional<Autor> buscarPorId(Long id){
        return repository.findById(id);
    }


}
