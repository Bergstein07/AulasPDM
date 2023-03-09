package com.example.aulaspdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calculadora extends AppCompatActivity {
    Button voltarDaCalculadora;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Calculadora_tela);

        voltarDaCalculadora = findViewById(R.id.voltarDaCalculadora);

        voltarDaCalculadora.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent in = new Intent(Calculadora.this, Calculadora.class);

                startActivity(in);


            }
        });}}