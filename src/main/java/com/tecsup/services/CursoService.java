package com.tecsup.services;

import com.tecsup.model.entities.Curso;

import java.util.List;

public interface CursoService {

    public List<Curso> FindAllCourse();
    public Curso FindByIdCourse(int id);
    public void SaveCourse(Curso c);
    public void DeleteCourse(int id);
}
