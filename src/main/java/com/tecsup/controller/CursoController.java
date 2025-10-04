package com.tecsup.controller;

import com.tecsup.model.entities.Curso;
import com.tecsup.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("curso")

public class CursoController {

    @Autowired
    private CursoService servicio;

    // Redirige la raíz (/) a /listar
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String root() {
        return "redirect:/listar";
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public String listar(Model model) {
        model.addAttribute("titulo","Listado de cursos");
        model.addAttribute("cursos",servicio.FindAllCourse());
        return "listView";
    }

    public String crear(Model model) {
        Curso curso = new Curso();  // Crear un nuevo objeto Curso
        model.addAttribute("curso", curso);
        model.addAttribute("titulo", "Formulario de Curso");
        return "formView";  // vista para el formulario
    }

    public String guardar(Curso curso, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("titulo", "Formulario de Curso");
            return "formView";  // Regresa al formulario en caso de error
        }

        servicio.SaveCourse(curso);  // Guardar el curso
        return "redirect:/listar";  // Redirigir a la lista de cursos
    }





}
