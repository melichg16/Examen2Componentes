package com.cenfotec.examen.entities;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;


@Entity
public class Auditor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private int telefono;
    private Date fechaNacimiento;
    private String email;
    private boolean disponibilidad;
    private char estado;
    @Transient
    private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    public Auditor() {
    }

    public Auditor(String nombre, String apellido1, String apellido2, String direccion, int telefono, String fechaNacimiento, String email, boolean disponibilidad,char estado) throws ParseException {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento =  format.parse(fechaNacimiento);
        this.email = email;
        this.disponibilidad = disponibilidad;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Auditor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", fechaNacimiento=" + fechaNacimiento +
                ", email='" + email + '\'' +
                ", disponibilidad=" + disponibilidad +
                ", estado=" + estado +
                '}';
    }
}
