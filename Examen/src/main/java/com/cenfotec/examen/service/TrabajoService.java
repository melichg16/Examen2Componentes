package com.cenfotec.examen.service;

import com.cenfotec.examen.entities.PersonaContacto;
import com.cenfotec.examen.entities.Trabajo;

import java.util.List;

public interface TrabajoService {
   public void save(Trabajo trabajo);

    public List<Trabajo> getAll();
}
