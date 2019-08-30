package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
        AsignarBotones();
        AsignarEventos();

    }

    void AsignarBotones(){
        botones_numeros[0] = findViewById(R.id.btn_0);
        botones_numeros[1] = findViewById(R.id.btn_1);
        botones_numeros[2] = findViewById(R.id.btn_2);
        botones_numeros[3] = findViewById(R.id.btn_3);
        botones_numeros[4] = findViewById(R.id.btn_4);
        botones_numeros[5] = findViewById(R.id.btn_5);
        botones_numeros[6] = findViewById(R.id.btn_6);
        botones_numeros[7] = findViewById(R.id.btn_7);
        botones_numeros[8] = findViewById(R.id.btn_8);
        botones_numeros[9] = findViewById(R.id.btn_9);
    }

    void AsignarEventos(){
        for(int i = 0; i<10; i++){
            final int finalI = i;
            botones_numeros[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    str_display += finalI;
                    display.setText(str_display);
                }
            });
        }
    }
}
