package com.example.ejerciciospracticos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class RadioGroup extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv3;
    private RadioButton r1,r2;
    private int nro1,nro2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv3=(TextView)findViewById(R.id.tv3);
        r1=(RadioButton)findViewById(R.id.r1);
        r2=(RadioButton)findViewById(R.id.r2);
    }
    //ESTE METODO SE EJECUTARA CUANDO SE PRESIONE EL BOTON
    public void operar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        //Comprobar si se han ingresado datos en los EditText
        if(validar(valor1)){
            et1.setError("Ingrese un número");
            et1.requestFocus();
        }else  if(validar(valor2)){
            et2.setError("Ingrese un número");
            et2.requestFocus();
        }else{
            nro1 = Integer.parseInt(valor1);
            nro2 = Integer.parseInt(valor2);
        }
        if (r1.isChecked()==true){
            int suma = nro1+nro2;
            String resu = String.valueOf(suma);
            tv3.setText("El resultado es: " + resu);
        }else
        if(r2.isChecked()==true){
            int resta= nro1-nro2;
            String resu = String.valueOf(resta);
            tv3.setText(resu);
        }
    }
    //metooo para validar datos
    public boolean validar(String val1){
        try{
            Integer.parseInt(val1);
            return false;
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }

    //metodo de para ir al inicio
    public void salir(View v){
        Intent intent = new Intent(RadioGroup.this, MainActivity.class);
        startActivity(intent);
    }

    public void nuevo(View view) {
        Intent intent = new Intent(RadioGroup.this, RadioGroup.class);
        startActivity(intent);
    }
}