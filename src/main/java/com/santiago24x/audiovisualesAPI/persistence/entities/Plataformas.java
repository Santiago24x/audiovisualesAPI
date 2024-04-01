package com.santiago24x.audiovisualesAPI.persistence.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "plataformas")

public class Plataformas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idplataformas")
    private Integer idplataformas;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "plataformas", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Contenidos> contenidos;

    public Plataformas() {
    }

    public Plataformas(Integer idplataformas, String nombre, List<Contenidos> contenidos) {
        this.idplataformas = idplataformas;
        this.nombre = nombre;
        this.contenidos = contenidos;
    }

    public Integer getIdplataformas() {
        return idplataformas;
    }

    public void setIdplataformas(Integer idplataformas) {
        this.idplataformas = idplataformas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Contenidos> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<Contenidos> contenidos) {
        this.contenidos = contenidos;
    }
}
