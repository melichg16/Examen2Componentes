package com.cenfotec.examen.service;

import com.cenfotec.examen.entities.Trabajo;
import com.cenfotec.examen.repository.ITrabajo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabajoServiceImpl implements TrabajoService {
    @Autowired
    ITrabajo iTrabajo;
    @Override
    public void save(Trabajo trabajo) {
        iTrabajo.save(trabajo);
    }

    @Override
    public List<Trabajo> getAll() {
        return iTrabajo.findAll();
    }
}
