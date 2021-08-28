package com.example.ejerciciospracticos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ProblemaPropuesto2 extends AppCompatActivity {

    private EditText et1;
    private TextView tv2;
    private int numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problema_propuesto2);

        et1 = (EditText) findViewById(R.id.et1);
        tv2 = (TextView) findViewById(R.id.tv2);
        //tv3 = (TextView) findViewById(R.id.tv3);
        SharedPreferences prefe = getSharedPreferences("datos", Context.MODE_PRIVATE);
        String v = String.valueOf(prefe.getInt("puntos", 0));
        tv2.setText(v);
        numero = 1 + (int) (Math.random() * 50);
        String cadena = String.valueOf(numero);
        Toast notificacion = Toast.makeText(this,cadena,Toast.LENGTH_LONG);
        notificacion.show();
    }
    //metodo del boton
    public void verificar(View v) {
        int valor = Integer.parseInt(et1.getText().toString());
        if (numero == valor) {
            int puntosactual = Integer.parseInt(tv2.getText()
                    .toString());
            puntosactual++;
            tv2.setText(String.valueOf(puntosactual));
            //tv3.setText("Muy bien ganó. Ahora pienso otro numero");
            et1.setText("");
            SharedPreferences preferencias =getSharedPreferences("datos", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = preferencias.edit();
            editor.putInt("puntos", puntosactual);
            editor.commit();
            numero = 1 + (int) (Math.random() * 50);
            Toast.makeText(this, "FELICIDADES HAS GANADO!!!!", Toast.LENGTH_SHORT).show();
        } else {
            if (valor > numero) {
                Toast.makeText(this, "Ingrese un numero menor al ingresado", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Ingrese un numero mayor al ingresado", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void salir(View view) {
        Intent intent = new Intent(ProblemaPropuesto2.this, MainActivity.class);
        startActivity(intent);
    }

    public void nuevo(View view) {
        Intent intent = new Intent(ProblemaPropuesto2.this, ProblemaPropuesto2.class);
        startActivity(intent);
    }
}