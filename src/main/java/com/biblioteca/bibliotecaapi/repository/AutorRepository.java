package com.biblioteca.bibliotecaapi.repository;

import com.biblioteca.bibliotecaapi.modelos.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutorRepository extends JpaRepository<Autor,Long> {
    List<Autor> findById(Autor idAutor);
}
