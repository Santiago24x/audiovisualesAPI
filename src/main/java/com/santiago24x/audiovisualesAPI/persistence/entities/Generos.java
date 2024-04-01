package com.santiago24x.audiovisualesAPI.persistence.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "generos")
public class Generos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idgenero")
    private Integer idgenero;

    @Column(name = "categoria")
    private String categoria;

    @OneToMany(mappedBy = "generos", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Contenidos> contenidos;

    public Generos() {
    }

    public Generos(Integer idgenero, String categoria, List<Contenidos> contenidos) {
        this.idgenero = idgenero;
        this.categoria = categoria;
        this.contenidos = contenidos;
    }
}
