package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_ej1;
    Button btn_ej2;
    Button btn_ej3;
    Button btn_ej4;
    Button btn_ej5;
    Button btn_ej6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ej1 = findViewById(R.id.btn_ej1);
        btn_ej2 = findViewById(R.id.btn_ej2);
        btn_ej3 = findViewById(R.id.btn_ej3);
        btn_ej4 = findViewById(R.id.btn_ej4);
        btn_ej5 = findViewById(R.id.btn_ej5);
        btn_ej6 = findViewById(R.id.btn_ej6);

    }

    public void ToEjercicio1 (View view){
        Intent ej1 = new Intent(this,Ejercicio1.class);
        startActivity(ej1);
    }

    public void ToEjercicio2 (View view){
        Intent ej2 = new Intent(this,Ejercicio2.class);
        startActivity(ej2);
    }

    public void ToEjercicio3 (View view){
        Intent ej3 = new Intent(this,Ejercicio3.class);
        startActivity(ej3);
    }

    public void ToEjercicio4 (View view){
        Intent ej4 = new Intent(this,Ejercicio4.class);
        startActivity(ej4);
    }

    public void ToEjercicio5 (View view){
        Intent ej5 = new Intent(this,Ejercicio5.class);
        startActivity(ej5);
    }

    public void ToEjercicio6 (View view){
        Intent ej6 = new Intent(this,Ejercicio6.class);
        startActivity(ej6);
    }
}
