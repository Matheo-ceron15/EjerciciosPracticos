package com.example.ejerciciospracticos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ProblemaPropuesto extends AppCompatActivity {
    private EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problema_propuesto);
        et1=(EditText)findViewById(R.id.Password);
    }
    //codigo al presionar el boton
    public void entrar(View v){

        String clave=et1.getText().toString();


        if (clave.equals("abc123")){
             Intent n= new Intent(this, Bienvenida.class);
             startActivity(n);
         }else
        if (clave.length()==0){
            Toast notificacion = Toast.makeText(this, "La clave no debe quedar vacia", Toast.LENGTH_LONG);
            notificacion.show();
        }
         else{
             Toast mensaje=Toast.makeText(this,"Clave incorrecta",Toast.LENGTH_LONG);
             mensaje.show();
         }
    }

    public void salir(View view) {
        finish();
    }
}