package com.example.dayer.myapplication;

import android.R;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Created by Erick on 18/11/2017.
 */

public class ComidaLista extends AppCompatActivity {

    GridView gridView;
    ArrayList<Comida> list;
    ComidaListaAdapter adapter = null;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac);


        gridView = (GridView) findViewById(R.id.gridView);
        list = new ArrayList<>();
        adapter = new ComidaListaAdapter(this, R.layout.comida_items, list);
        gridView.setAdapter(adapter);

        Cursor cursor = MainActivity.sqLiteHelper.getData("SELECT * FROM  FOOD");
        list.clear();

        while (cursor.moveToNext()){


            int id = cursor.getInt(0);
            String nombre = cursor.getString(1);
            String precio = cursor.getString(2);
            String lugar = cursor.getString(3);
            byte [] imagen = cursor.getBlob(4);

            list.add(new Comida(id, nombre, precio, lugar, imagen));
        }

        adapter.notifyDataSetChanged();

    }
}



