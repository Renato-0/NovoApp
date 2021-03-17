package com.example.novoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Log extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        Button Login = (Button) findViewById(R.id.button2);
        Login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tSenha = (TextView) findViewById(R.id.tSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();
                if(login.equals("admin") && senha.equals("admin")){
                    Intent it = new Intent(Log.this, Bem.class);
                    startActivity(it);
                    Toast.makeText(Log.this, "Login realizado com sucesso", Toast.LENGTH_SHORT).show();
                    Toast.makeText(Log.this, "Bem vindo!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Log.this, "Login ou Senha incorretos", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


}
