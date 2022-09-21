package com.biblioteca.bibliotecaapi.service;

import com.biblioteca.bibliotecaapi.dto.LivroDto;
import com.biblioteca.bibliotecaapi.modelos.Livro;
import com.biblioteca.bibliotecaapi.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    @Autowired
    private AutorService autorService;

    public List<Livro> buscarTodosLivros(){
        return repository.findAll();
    }

    public Livro cadastrarLivros(LivroDto livroDto){
        var autor = autorService.buscarPorId(livroDto.getAutorId());
        var livro = new Livro(livroDto, autor.get());
        return repository.save(livro);
    }
}
