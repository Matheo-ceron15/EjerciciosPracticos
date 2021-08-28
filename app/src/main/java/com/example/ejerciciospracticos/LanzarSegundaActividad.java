package com.example.ejerciciospracticos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LanzarSegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanzar_segunda_actividad);
    }
    public void acercade(View view){
        Intent i = new Intent(this, AcercaDe.class);
        startActivity(i);
    }
}