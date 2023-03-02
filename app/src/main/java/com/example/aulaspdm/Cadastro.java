package com.example.aulaspdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Cadastro extends AppCompatActivity {
    TextView Cadastro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitycadastro);

        Cadastro=findViewById(R.id.buttonIrCadastro);

        Intent it = getIntent();

    }
}