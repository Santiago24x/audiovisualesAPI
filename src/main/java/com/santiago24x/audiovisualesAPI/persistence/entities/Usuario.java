package com.santiago24x.audiovisualesAPI.persistence.entities;


import jakarta.persistence.*;

import java.util.List;



@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuarios")
    private Long idusuarios;
    @Column(name = "correoUsuarios")
    private String username;
    @Column(name = "contrasena")
    private String password;

    @ManyToMany(mappedBy = "usuarios")
    private List<Contenidos> contenidos;

    public Usuario() {
    }

    public Usuario(Long idusuarios, String username, String password, List<Contenidos> contenidos) {
        this.idusuarios = idusuarios;
        this.username = username;
        this.password = password;
        this.contenidos = contenidos;
    }

    public Long getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(Long idusuarios) {
        this.idusuarios = idusuarios;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Contenidos> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<Contenidos> contenidos) {
        this.contenidos = contenidos;
    }
}
