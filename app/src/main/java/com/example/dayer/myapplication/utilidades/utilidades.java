package com.example.dayer.myapplication.utilidades;

/**
 * Created by Dayer on 30/10/2017.
 */

public class utilidades {
    public static final  String TABLA_ADMINISTRADOR = "administrador";
    public static final  String CAMPO_ID="id";
    public static final  String CAMPO_NOMBRE="nombre";
    public static final  String CAMPO_PASS="contraseña";



    public  static final String CREAR_TABLA_ADMINISTRADOR = "CREATE TABLE  " +
            ""+TABLA_ADMINISTRADOR+"("+CAMPO_ID+" " +
            "INTEGER, "+CAMPO_NOMBRE+" TEXT," + CAMPO_PASS+" TEXT)";



    public static final  String TABLA_SUGERENCIAS = "sugerencias";
    public static final  String CAMPOIDSUG="id";
    public static final  String CAMPONAME="nombre";
    public static final  String CAMPODESCRIP="descripcion";

    public static final String CREAR_TABLA_SUGERENCIAS = "CREATE TABLE   " +
            ""+TABLA_SUGERENCIAS+"("+CAMPOIDSUG+"INTEGER PRIMARY KEY AUTOINCREMENT, "
            +CAMPONAME+" TEXT," +CAMPODESCRIP+" TEXT)";
}
