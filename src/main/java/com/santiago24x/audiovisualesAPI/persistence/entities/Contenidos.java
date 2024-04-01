package com.santiago24x.audiovisualesAPI.persistence.entities;





import jakarta.persistence.*;

import java.util.List;




@Entity
@Table(name = "contenidos")
public class Contenidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontenidos")
    private Long idcontenidos;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "estadoVisualizacion")
    private String estadoVisualizacion;

    @Column(name = "calificacion")
    private String calificacion;

    @Column(name = "comentario")
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "idplataformas")
    private Plataformas plataformas;

    @ManyToOne
    @JoinColumn(name = "idgeneros")
    private Generos generos;

    @ManyToOne
    @JoinColumn(name = "idtiposContenido")
    private TipoContenido tipoContenido;

    @ManyToMany(fetch = FetchType.EAGER )
    @JoinTable(
            name = "contenidos_usuarios",
            joinColumns = {@JoinColumn(name = "id_usuarios")},
            inverseJoinColumns = {@JoinColumn(name = "idcontenidos")}
    )
    private List<Usuario> usuarios;

    public Contenidos() {
    }









}
