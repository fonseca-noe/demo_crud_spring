package com.tecsup.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="curso")

public class Curso {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @NotNull
    private String nombre;

    @Column
    @NotNull
    private int creditos;

    public Curso() {
    }

    public Curso(int id, String nombre, int creditos) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    @NotNull
    public int getId() {
        return id;
    }

    public void setId(@NotNull int id) {
        this.id = id;
    }

    public @NotNull String getNombre() {
        return nombre;
    }

    public void setNombre(@NotNull String nombre) {
        this.nombre = nombre;
    }

    @NotNull
    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(@NotNull int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", creditos=" + creditos +
                '}';
    }
}
