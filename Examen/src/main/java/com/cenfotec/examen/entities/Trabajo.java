package com.cenfotec.examen.entities;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class Trabajo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String auditoria;
    private Date fechaAuditoria;
    @OneToOne
    @JoinColumn(name="cliente_id", nullable=false)
    private Cliente cliente;
    @OneToOne
    @JoinColumn(name="auditor_id", nullable=false)
    private Auditor auditor;

    @Transient
    private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    public Trabajo() {
    }

    public Trabajo(String auditoria, String fechaAuditoria, Cliente cliente, Auditor auditor) throws ParseException {
        this.auditoria = auditoria;
        this.fechaAuditoria = format.parse(fechaAuditoria);
        this.cliente = cliente;
        this.auditor = auditor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(String auditoria) {
        this.auditoria = auditoria;
    }

    public Date getFechaAuditoria() {
        return fechaAuditoria;
    }

    public void setFechaAuditoria(Date fechaAuditoria) {
        this.fechaAuditoria = fechaAuditoria;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Auditor getAuditor() {
        return auditor;
    }

    public void setAuditor(Auditor auditor) {
        this.auditor = auditor;
    }
}
