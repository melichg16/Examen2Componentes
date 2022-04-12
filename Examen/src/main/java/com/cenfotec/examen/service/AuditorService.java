package com.cenfotec.examen.service;

import com.cenfotec.examen.entities.Auditor;


import java.util.List;
import java.util.Optional;


public interface AuditorService {

    public void save(Auditor auditor);
    public void delete(Auditor auditor);
    public List<Auditor> getAll();
    public Optional<Auditor> get(Long id);
   // public void deleteAuditor(Auditor auditor);
}
