package com.example.dayer.myapplication.adaptars;

import android.content.ClipData;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import com.example.dayer.myapplication.Main3Activity;
import com.example.dayer.myapplication.R;
import com.example.dayer.myapplication.dominio.Restaurantes;

import java.util.List;

/**
 * Created by Dayer on 12/11/2017.
 */

public class RestaurantAdapter extends BaseAdapter{
    private  ArrayList<Restaurantes> listIteam;
    private  Context context;

    public RestaurantAdapter(Context context, ArrayList<Restaurantes> listIteam) {
        this.listIteam = listIteam;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listIteam.size();
    }

    @Override
    public Object getItem(int position) {
        return listIteam.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Restaurantes Item = (Restaurantes) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.iteam_resta, null);
        ImageView imgfoto = (ImageView) convertView.findViewById(R.id.iv_resta);
        TextView tvTitulo = (TextView) convertView.findViewById(R.id.tv_nombre);
        TextView tvUbicacion = (TextView) convertView.findViewById(R.id.tv_ubicacion);

        imgfoto.setImageResource(Item.getImagenes());
        tvTitulo.setText(Item.getNombre());
        tvUbicacion.setText(Item.getUbicacion());

        return convertView;
    }
}