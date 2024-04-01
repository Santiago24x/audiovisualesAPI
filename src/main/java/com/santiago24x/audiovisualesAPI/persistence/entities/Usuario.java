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
    private String correoUsuarios;
    @Column(name = "contrasena")
    private String contrasena;

    @ManyToMany(mappedBy = "usuarios")
    private List<Contenidos> contenidos;

    public Usuario() {
    }





}
