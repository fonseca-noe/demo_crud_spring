package com.tecsup.model.daos;

import com.tecsup.model.entities.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Integer> {
}
