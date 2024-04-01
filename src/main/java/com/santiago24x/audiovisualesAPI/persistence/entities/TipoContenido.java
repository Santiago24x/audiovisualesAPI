package com.santiago24x.audiovisualesAPI.persistence.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tipoContenido")
public class TipoContenido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipoContenido")
    private Integer idtipoContenido;
    @Column(name = "categoria")
    private String categoria;

    @OneToMany(mappedBy = "tipoContenido", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Contenidos> contenidos;


    public TipoContenido() {
    }

    public TipoContenido(Integer idtipoContenido, String categoria, List<Contenidos> contenidos) {
        this.idtipoContenido = idtipoContenido;
        this.categoria = categoria;
        this.contenidos = contenidos;
    }

    public Integer getIdtipoContenido() {
        return idtipoContenido;
    }

    public void setIdtipoContenido(Integer idtipoContenido) {
        this.idtipoContenido = idtipoContenido;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Contenidos> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<Contenidos> contenidos) {
        this.contenidos = contenidos;
    }
}
