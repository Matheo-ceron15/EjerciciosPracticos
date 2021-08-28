package com.example.ejerciciospracticos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NotificacionesSencillas extends AppCompatActivity {


    private EditText et1;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificaciones_sencillas);

        et1=(EditText)findViewById(R.id.editText);
        num=(int)(Math.random()*1000001);
        String cadena = String.valueOf(num);
        Toast notificacion = Toast.makeText(this,cadena,Toast.LENGTH_LONG);
        notificacion.show();

    }

    //metodo del boton
    public void controlar(View v){
        String ValorIngresado=et1.getText().toString();
        int valor = Integer.parseInt(ValorIngresado);
        if (valor==num){
            Toast notificacion=Toast.makeText(this,"Muy bien recordastes el numero mostrado", Toast.LENGTH_LONG);
            notificacion.show();
        }
        else{
            Toast notificacion=Toast.makeText(this,"Lo siento pero no es el numero mostrado", Toast.LENGTH_LONG);
            notificacion.show();
        }
    }


    public void salir(View view) {
        Intent intent = new Intent(NotificacionesSencillas.this, MainActivity.class);
        startActivity(intent);
    }

    public void nuevo(View view) {
        Intent intent = new Intent(NotificacionesSencillas.this, NotificacionesSencillas.class);
        startActivity(intent);
    }
}