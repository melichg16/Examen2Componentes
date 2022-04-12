package com.cenfotec.examen.repository;

import com.cenfotec.examen.entities.Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITrabajo extends JpaRepository<Trabajo,Long> {
}
