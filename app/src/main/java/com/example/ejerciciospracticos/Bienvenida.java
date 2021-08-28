package com.example.ejerciciospracticos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Bienvenida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);
        Toast notificacion=Toast.makeText(this,"Contraseña correcta!!! BIENVENIDO", Toast.LENGTH_LONG);
        notificacion.show();
    }

    public void salir(View view) {
            Intent intent = new Intent(Bienvenida.this, MainActivity.class);
            startActivity(intent);

    }
}