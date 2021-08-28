package com.example.ejerciciospracticos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AlmacenamientoClaseShared extends AppCompatActivity {
    ventana_poo ventana = new ventana_poo();
    private EditText et1, et2,et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almacenamiento_clase_shared);

        et1 = (EditText)findViewById(R.id.respuesta);
        SharedPreferences prefe = getSharedPreferences ("datos", Context.MODE_PRIVATE);
        et1.setText(prefe.getString("mail",""));


        //Segunda parte
        et2=(EditText)findViewById(R.id.Rnom);
        et3=(EditText)findViewById(R.id.Rdato);
    }
        //codigo de ejecucion del boton
    public void ejecutar(View view){

        if (et1.length()==0){
            Toast.makeText(this, "Debe ingresar un correo", Toast.LENGTH_SHORT).show();
        }else{
            SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor=preferencias.edit();
            ventana.setCorreo( et1.getText().toString());
            editor.putString("mail", ventana.getCorreo());
            editor.commit();
            Toast.makeText(this, "Email guardado correctamente", Toast.LENGTH_LONG).show();
        }
    }
    //segunda parte del codigo -- boton grabar y recuperar
    public void grabar(View v){
        String nombre= et2.getText().toString();
        String datos=et3.getText().toString();
        if (nombre.length()==0){
            Toast.makeText(this, "Porfavor ingrese un nombre", Toast.LENGTH_SHORT).show();
        }else{
                SharedPreferences preferencia = getSharedPreferences("agenda", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferencia.edit();
                editor.putString(nombre, datos);
                editor.commit();
                Toast.makeText(this, "Datos grabados", Toast.LENGTH_LONG).show();
            }

    }
    public void recuperar(View v){
        String nombre =et2.getText().toString();
        SharedPreferences prefe=getSharedPreferences("agenda", Context.MODE_PRIVATE);
        String d=prefe.getString(nombre,"");
        if (d.length()==0){
            Toast.makeText(this, "No existe dicho nombre en la agenda", Toast.LENGTH_LONG).show();

        }
        else{
            et3.setText(d);
        }
    }

    public void salir(View view) {
        Intent intent = new Intent(AlmacenamientoClaseShared.this, MainActivity.class);
        startActivity(intent);
    }

    public void restablecer(View view) {
        Intent intent = new Intent(AlmacenamientoClaseShared.this, AlmacenamientoClaseShared.class);
        startActivity(intent);
    }
}