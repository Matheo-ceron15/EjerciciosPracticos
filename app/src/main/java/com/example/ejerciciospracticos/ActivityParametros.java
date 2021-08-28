package com.example.ejerciciospracticos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityParametros extends AppCompatActivity {
        private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametros);
        et1=(EditText)findViewById(R.id.editText);
    }
    public void ver(View v){
        Intent i = new Intent(this, ActivityParemetros2.class);
        i.putExtra("direccion", et1.getText().toString());
        startActivity(i);
    }

    public void salir(View view) {
        Intent intent = new Intent(ActivityParametros.this, MainActivity.class);
        startActivity(intent);
    }
}