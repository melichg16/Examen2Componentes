package com.cenfotec.examen.service;

import com.cenfotec.examen.entities.PersonaContacto;

import java.util.List;
import java.util.Optional;

public interface PersonaContactoService  {
    public void save(PersonaContacto personaContacto);

    public List<PersonaContacto> getAll();

    public Optional<PersonaContacto> get(Long id);

    public  void delete(PersonaContacto contacto);
}
