package com.cenfotec.examen.entities;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String razon;
    private String cedJuridica;
    private String direccion;
    private int telefono;

    @OneToMany(fetch=FetchType.LAZY, mappedBy="cliente")
    private Set<PersonaContacto> contactos;

    public Cliente() {
    }

    public Cliente(String razon, String cedJuridica, String direccion, int telefono) {
        this.razon = razon;
        this.cedJuridica = cedJuridica;
        this.direccion = direccion;
        this.telefono = telefono;

    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getCedJuridica() {
        return cedJuridica;
    }

    public void setCedJuridica(String cedJuridica) {
        this.cedJuridica = cedJuridica;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    public Set<PersonaContacto> getContactos() {
        return contactos;
    }

    public void setContactos(Set<PersonaContacto> contactos) {
        this.contactos = contactos;
    }
}
