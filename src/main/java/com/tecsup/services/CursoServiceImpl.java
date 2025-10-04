package com.tecsup.services;

import com.tecsup.model.daos.CursoRepository;
import com.tecsup.model.entities.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository dao;

    @Override
    @Transactional(readOnly = true)
    public List<Curso> FindAllCourse() {
        return (List<Curso>) dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Curso FindByIdCourse(int id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void SaveCourse(Curso c) {
        dao.save(c);
    }

    @Override
    @Transactional(readOnly = false)
    public void DeleteCourse(int id) {
        dao.deleteById(id);
    }
}
