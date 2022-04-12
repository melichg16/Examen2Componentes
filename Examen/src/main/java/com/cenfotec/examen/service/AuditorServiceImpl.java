package com.cenfotec.examen.service;

import com.cenfotec.examen.entities.Auditor;
import com.cenfotec.examen.repository.IAuditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuditorServiceImpl implements AuditorService{
    @Autowired
    IAuditor iAuditor;

    @Override
    public void save(Auditor auditor) {
        iAuditor.save(auditor);
    }

    @Override
    public void delete(Auditor auditor) {
        iAuditor.delete(auditor);
    }

    @Override
    public List<Auditor> getAll() {
        return iAuditor.findAll();
    }

    @Override
    public Optional<Auditor> get(Long id) {
        return iAuditor.findById(id);
    }

   /* @Override
    public void deleteAuditor(Auditor auditor) {
        iAuditor.delete(auditor);
    }*/
}
