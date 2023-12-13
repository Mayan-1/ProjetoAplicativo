package com.example.tela_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class tela_login extends AppCompatActivity {

    private TextView text_tela_cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Iniciarcomponentes();

        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tela_login.this, tela_cadastro.class);
                startActivity(intent);


            }
        });




    }
    private void Iniciarcomponentes(){
        text_tela_cadastro = findViewById(R.id.text_tela_cadastro);
    }
}