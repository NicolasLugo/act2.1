package com.example.act21;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Inicio extends AppCompatActivity {
    private TextView lblInicio;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        lblInicio = (TextView) findViewById(R.id.lblInicio);

        Intent rIntent = getIntent();
        String nombre = rIntent.getExtras().getString("STNombre");
        lblInicio.setText("El nombre de tu foto es: "+ nombre);

    }
}