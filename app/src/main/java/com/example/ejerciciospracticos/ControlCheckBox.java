package com.example.ejerciciospracticos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class ControlCheckBox extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv3;
    private CheckBox checkBox1, checkBox2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_check_box);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv3=(TextView)findViewById(R.id.tv3);

        checkBox1=(CheckBox)findViewById(R.id.checkBox);
        checkBox2=(CheckBox)findViewById(R.id.checkBox2);

    }

    //Este metodo se ejecutara cuando se presione el boton
    public void resolver(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();

        String resu= "";

        if(validar(valor1)){
            et1.setError("Ingrese un número");
            et1.requestFocus();
        }else  if(validar(valor2)){
            et2.setError("Ingrese un número");
            et2.requestFocus();
        }else{
            int nro1=Integer.parseInt(valor1);
            int nro2= Integer.parseInt(valor2);
                if (checkBox1.isChecked()==true){
                    int suma=nro1+nro2;
                    resu="La suma es: " + suma;
                }
                if (checkBox2.isChecked()==true){
                    int resta=nro1-nro2;
                    resu="La resta es: " + resta;
                }
        }
        tv3.setText(resu);
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
    public void salir(View v){
        Intent intent = new Intent(ControlCheckBox.this, MainActivity.class);
        startActivity(intent);
    }

    public void nuevo(View view) {
        Intent intent = new Intent(ControlCheckBox.this, ControlCheckBox.class);
        startActivity(intent);
    }
}