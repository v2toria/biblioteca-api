package com.biblioteca.bibliotecaapi.repository;

import com.biblioteca.bibliotecaapi.modelos.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
