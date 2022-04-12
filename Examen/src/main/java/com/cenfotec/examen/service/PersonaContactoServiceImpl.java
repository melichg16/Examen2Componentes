package com.cenfotec.examen.service;

import com.cenfotec.examen.entities.PersonaContacto;
import com.cenfotec.examen.repository.IPersonaContacto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaContactoServiceImpl implements PersonaContactoService {

@Autowired
    IPersonaContacto iPersonaContacto;
    @Override
    public void save(PersonaContacto personaContacto) {
        iPersonaContacto.save(personaContacto);
    }

    @Override
    public List<PersonaContacto> getAll() {
        return iPersonaContacto.findAll();
    }

    @Override
    public Optional<PersonaContacto> get(Long id) {
        return iPersonaContacto.findById(id);
    }


    @Override
    public void delete(PersonaContacto contacto) {
        iPersonaContacto.delete(contacto);
    }
}
