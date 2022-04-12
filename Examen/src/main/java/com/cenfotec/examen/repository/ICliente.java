package com.cenfotec.examen.repository;

import com.cenfotec.examen.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICliente extends JpaRepository<Cliente,Long> {
}
