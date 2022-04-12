package com.cenfotec.examen.service;

import com.cenfotec.examen.entities.Auditor;
import com.cenfotec.examen.entities.Cliente;
import com.cenfotec.examen.repository.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    ICliente iCliente;

    @Override
    public Optional<Cliente> get(long id) {
        return iCliente.findById(id);
    }

    @Override
    public void save(Cliente cliente) {

        iCliente.save(cliente);
    }

    @Override
    public List<Cliente> getAll() {
        return iCliente.findAll();
    }
}
