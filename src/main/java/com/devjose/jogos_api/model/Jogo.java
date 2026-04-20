package com.devjose.jogos_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "jogos")
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String genero;
    private String plataforma;

    public Jogo() {}

    public Jogo(String nome, String genero, String plataforma) {
        this.nome = nome;
        this.genero = genero;
        this.plataforma = plataforma    ;
    }

    public Long getId() { return id; }

    public String getNome() { return nome; }
    public void setNome(String nome) {this.nome = nome; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

    @Override
    public String toString() {
        return "Id: " + getId() +
                " | Nome: " + getNome() +
                " | Gênero: " + getGenero() +
                " | Plataforma: " + getPlataforma();
    }
}

