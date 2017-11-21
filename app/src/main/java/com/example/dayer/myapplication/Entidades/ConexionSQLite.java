package com.example.dayer.myapplication.Entidades;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.dayer.myapplication.utilidades.utilidades;

/**
 * Created by Dayer on 30/10/2017.
 */

public class ConexionSQLite extends SQLiteOpenHelper {

    public ConexionSQLite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
     db.execSQL(utilidades.CREAR_TABLA_ADMINISTRADOR);
        db.execSQL(utilidades.CREAR_TABLA_SUGERENCIAS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
     db.execSQL("DROP TABLE IF EXITS TABLE administrador");
        db.execSQL("DROP TABLE IF EXITS TABLE sugerencias");
        onCreate(db);
    }
}
