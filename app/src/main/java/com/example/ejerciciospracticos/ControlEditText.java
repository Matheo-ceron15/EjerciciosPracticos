package com.example.ejerciciospracticos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ControlEditText extends AppCompatActivity {
        private EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_edit_text);
        et1 =(EditText)findViewById(R.id.usuario);
        et2 = (EditText)findViewById(R.id.contra);

    }
    public void verificar(View v){
        String clave=et2.getText().toString();
        if (clave.length()==0){
            Toast notificacion = Toast.makeText(this, "La clave no debe quedar vacia", Toast.LENGTH_LONG);
            notificacion.show();
        }
    }


    public void salir(View view) {
        finish();
    }
}