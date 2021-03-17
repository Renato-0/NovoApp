package com.example.novoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem);

        Button Inicio = (Button) findViewById(R.id.button3);
        Inicio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Bem.this, MainActivity.class);
                startActivity(it);
            }
        });

        Button Login = (Button) findViewById(R.id.button4);
        Login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Bem.this, Log.class);
                startActivity(it);
            }
        });
    }
}
