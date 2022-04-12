package com.cenfotec.examen.service;

import com.cenfotec.examen.entities.Auditor;
import com.cenfotec.examen.entities.Cliente;
import com.cenfotec.examen.entities.PersonaContacto;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    public Optional<Cliente> get(long id);

    void save(Cliente cliente);

    public List<Cliente> getAll();
}
