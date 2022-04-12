package com.cenfotec.examen.repository;

import com.cenfotec.examen.entities.Auditor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuditor extends JpaRepository<Auditor,Long> {
}
