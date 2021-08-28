package com.example.ejerciciospracticos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ControlimgeButton extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controlimge_button);

        tv1=(TextView)findViewById(R.id.tv1);

    }

    //metodo cuando se precione la img button

    public void llamar(View view){

        tv1.setText("Llamando....");
    }
    public void salir(View v){
        Intent intent = new Intent(ControlimgeButton.this, MainActivity.class);
        startActivity(intent);
    }

    public void colgar(View view) {
        Intent intent = new Intent(ControlimgeButton.this, ControlimgeButton.class);
        startActivity(intent);
        Toast.makeText(this, "Llamada finalizada", Toast.LENGTH_SHORT).show();
    }
}