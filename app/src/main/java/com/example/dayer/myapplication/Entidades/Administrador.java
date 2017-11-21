package com.example.dayer.myapplication.Entidades;

/**
 * Created by Dayer on 30/10/2017.
 */

public class Administrador {
    private Integer id;
    private String nombre;
    private String Contraseña;

    public Administrador(Integer id, String nombre, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        Contraseña = contraseña;
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

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }
}
