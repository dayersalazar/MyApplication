package com.example.dayer.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    private ImageView ivusu;
    private ImageView ivadmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios);
        ivusu = (ImageView)findViewById(R.id.ivusu);
        ivadmin = (ImageView) findViewById(R.id.ivadmin);

        ivusu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ivusu = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(ivusu);
            }
        });
        ivadmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ivadmin = new Intent(Main2Activity.this, MainloginActivity.class);
                startActivity(ivadmin);
            }
        });
    }
}
