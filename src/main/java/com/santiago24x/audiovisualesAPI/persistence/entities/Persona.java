package com.santiago24x.audiovisualesAPI.persistence.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private Integer idpersona;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "cedula")
    private String cedula;

    @OneToOne
    @JoinColumn(name = "IdUsuarios_fk")
    private Usuario IdUsuario_fk;

    public Persona() {
    }

    public Persona(Integer idpersona, String nombre, String telefono, String cedula, Usuario idUsuario_fk) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.telefono = telefono;
        this.cedula = cedula;
        IdUsuario_fk = idUsuario_fk;
    }

    public Integer getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Usuario getIdUsuario_fk() {
        return IdUsuario_fk;
    }

    public void setIdUsuario_fk(Usuario idUsuario_fk) {
        IdUsuario_fk = idUsuario_fk;
    }
}
