package com.example.aulaspdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculadora extends AppCompatActivity {
    Button voltarDaCalculadora;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora_tela);
    }

    public void add(View v){
        EditText et1 =(EditText)findViewById(R.id.numero1);
        EditText et2 =(EditText)findViewById(R.id.numero2);
        EditText et3 =(EditText)findViewById(R.id.resultado);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et1.getText().toString());
        int result = n1+n2;

        et3.setText(result);
    }

    public void menos(View v){
        EditText et1 =(EditText)findViewById(R.id.numero1);
        EditText et2 =(EditText)findViewById(R.id.numero2);
        EditText et3 =(EditText)findViewById(R.id.resultado);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et1.getText().toString());
        int result = n1-n2;

        et3.setText(result);
    }
    /*public void add(View v){
        EditText et1 =(EditText)findViewById(R.id.numero1);
        EditText et2 =(EditText)findViewById(R.id.numero2);
        EditText et3 =(EditText)findViewById(R.id.resultado);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et1.getText().toString());
        int result = n1+n2;

        et3.setText(result);
    }*/

    }
