package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Ejercicio6 extends AppCompatActivity {
 Button[] botones_numeros = new Button[10];
 TextView display;
 String str_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio6);
        display = findViewById(R.id.txt_resultado);

    }

    void AsignarBotones(){
        botones_numeros[0] = findViewById(R.id.btn_0);
        botones_numeros[1] = findViewById(R.id.btn_1);
        botones_numeros[2] = findViewById(R.id.btn_2);
        botones_numeros[3] = findViewById(R.id.btn_3);
    }
}
