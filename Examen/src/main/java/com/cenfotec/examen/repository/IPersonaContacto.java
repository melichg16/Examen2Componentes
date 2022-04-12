package com.cenfotec.examen.repository;

import com.cenfotec.examen.entities.PersonaContacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaContacto extends JpaRepository<PersonaContacto,Long> {
}
