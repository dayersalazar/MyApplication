package com.example.dayer.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.dayer.myapplication.adaptars.RestaurantAdapter;
import com.example.dayer.myapplication.dominio.Restaurantes;

import java.util.ArrayList;
import android.R.*;

public class Main3Activity extends AppCompatActivity {
   private ListView lvItem;
    private RestaurantAdapter adaptador;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        toolbar.setTitle("Restaurantes");
        setSupportActionBar(toolbar);
        lvItem = (ListView) findViewById(R.id.lvItems);
        adaptador = new RestaurantAdapter(this, GetArrayItems());
        lvItem.setAdapter(adaptador);

    }
    public ArrayList<Restaurantes> GetArrayItems() {
        ArrayList<Restaurantes> listItems = new ArrayList<>();
        listItems.add(new Restaurantes(R.drawable.donsancho,"Pizzeria Don Sancho", "Jr. Genral prado 645"));
        listItems.add(new Restaurantes(R.drawable.piazzetta,"La piazzetta", "Jr. Damazo Beraun 845"));
        listItems.add(new Restaurantes(R.drawable.tradiciones,"Recreo Tradiciones Huanuqueñas", "2444, Jiron Huallayco"));
        listItems.add(new Restaurantes(R.drawable.huapri,"Salon de te Huapri", "Jr. 2 de Mayo 974"));
        listItems.add(new Restaurantes(R.drawable.falcon,"Recreo Falcon", "Jr. 2 de Mayo 206"));
        listItems.add(new Restaurantes(R.drawable.lenador,"El Leñador", "Jr. Bolivar 349"));
        listItems.add(new Restaurantes(R.drawable.miskytanta,"Misky Tanta", "Malecon Alomia Robles"));
        listItems.add(new Restaurantes(R.drawable.shorton,"Polleria Shorton Grill", "Jr. Damaso Beraun 683"));
        listItems.add(new Restaurantes(R.drawable.opiparo,"Opiparo Restaurant Huanuco", "Jr. 2 de Mayo 1320"));
        return listItems;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main3, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}