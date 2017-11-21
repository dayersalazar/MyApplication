package com.example.dayer.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainloginActivity extends AppCompatActivity {
    private TextView tvadmin;
    private EditText etadmin;
    private TextView tvcontra;
    private EditText etcontra;
    private Button btningresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainlogin);

        etadmin = (EditText) findViewById(R.id.etadmin);
        etcontra = (EditText) findViewById(R.id.etcontra);
        btningresar = (Button) findViewById(R.id.btningresar);

        btningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btningresar = new Intent(MainloginActivity.this, Main3Activity.class);
                startActivity(btningresar);
            }
        });

    }
}
