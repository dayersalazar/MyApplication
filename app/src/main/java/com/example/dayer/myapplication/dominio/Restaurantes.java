package com.example.dayer.myapplication.dominio;

/**
 * Created by Dayer on 11/11/2017.
 */

public class Restaurantes {
    private String nombre;
    private String ubicacion;
    private int imagenes;

    public Restaurantes(int imagenes, String nombre, String ubicacion) {
        this.imagenes = imagenes;
        this.nombre = nombre;
        this.ubicacion = ubicacion;

    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getImagenes() {
        return imagenes;
    }


}