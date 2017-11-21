package com.example.dayer.myapplication.Entidades;

import android.content.Intent;

/**
 * Created by Dayer on 30/10/2017.
 */

public class Sugerencias {
    private Integer id;
    private String nombre;
    private String description;

    public Sugerencias(Integer id, String nombre, String description) {
        this.id = id;
        this.nombre = nombre;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
