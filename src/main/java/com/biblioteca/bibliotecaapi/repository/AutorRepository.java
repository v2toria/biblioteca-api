package com.biblioteca.bibliotecaapi.repository;

import com.biblioteca.bibliotecaapi.modelos.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor,Long> {
}
