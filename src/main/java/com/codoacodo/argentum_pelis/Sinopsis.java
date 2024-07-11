package com.codoacodo.argentum_pelis;

import jakarta.persistence.*;

@Entity
@Table(name = "sinopsis")
public class Sinopsis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String sinopsis;
    private String personaje;
    private String poster;


    public Long getId() {
        return id;
    }

    public Sinopsis() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFrase() {
        return sinopsis;
    }

    public void setFrase(String frase) {
        this.sinopsis = frase;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
