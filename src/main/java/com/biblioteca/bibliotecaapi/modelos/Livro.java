package com.biblioteca.bibliotecaapi.modelos;

import com.biblioteca.bibliotecaapi.dto.LivroDto;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Integer qtdPaginas;
    private Integer anoLancamento;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    public Livro(){

    }

    public Livro(LivroDto livroDto, Autor autor){
        this.titulo = livroDto.getTitulo();
        this.qtdPaginas = livroDto.getQtdPaginas();
        this.anoLancamento = livroDto.getAnoLancamento();
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(Integer qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
