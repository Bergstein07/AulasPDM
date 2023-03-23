package com.example.aulaspdm;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    /*Button buttonIrCadastro;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonIrCadastro = findViewById(R.id.buttonIrCadastro);
        buttonIrCadastro.setOnClickListener(new View.OnClickListener() {
@Override
            public void onClick(View view) {
                Intent in = new Intent(Menu.this, Calculadora.class);
                startActivity(in);
            }
        });}}
*/


    Button buttonIrCalculadora;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonIrCalculadora = findViewById(R.id.buttonIrCalculadora);
        buttonIrCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this,Calculadora.class);
                startActivity(intent);
            }
        });}}

