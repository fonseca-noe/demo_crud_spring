package com.tecsup.controller;

import com.tecsup.model.entities.Curso;
import com.tecsup.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("curso")

public class CursoController {

    @Autowired
    private CursoService servicio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public String listar(Model model) {
        model.addAttribute("titulo","Listado de cursos");
        model.addAttribute("cursos",servicio.FindAllCourse());
        return "listView";
    }




}
