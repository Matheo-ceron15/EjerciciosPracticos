package com.example.ejerciciospracticos;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.ejerciciospracticos.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AcercaDe.class);
                startActivity(intent);
                //Snackbar.make(view, "Opcion no disponible por el momento", Snackbar.LENGTH_LONG)
                        //.setAction("Opcion", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

//noinspection SimplifiableIfStatement

        if (id == R.id.pantalla1){

            Toast.makeText(this, "Ejercicio 1", Toast.LENGTH_SHORT).show();
            //LLAMADO HACIA OTRA MainActivity
            Intent intent = new Intent(MainActivity.this, CapturarBoton.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla2) {
            Toast.makeText(this, "Ejercicio 2", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, RadioGroup.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla3) {
            Toast.makeText(this, "Ejercicio 3", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, ControlCheckBox.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla4) {
            Toast.makeText(this, "Ejercicio 4", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this,ControladorSpinner.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla5) {
            Toast.makeText(this, "Ejercicio 5", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, ControlListView.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla6) {
            Toast.makeText(this, "Ejercicio 6", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, ControlimgeButton.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla7) {
            Toast.makeText(this, "Ejercicio 7", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, NotificacionesSencillas.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla8) {
            Toast.makeText(this, "Ejercicio 8", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, ControlEditText.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla9) {
            Toast.makeText(this, "Ejercicio 9", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, LanzarSegundaActividad.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.problema) {
            Toast.makeText(this, "Problema propuesto en la guia", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, ProblemaPropuesto.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla10) {
            Toast.makeText(this, "Ejercicio 10", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, ActivityParametros.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla11){
            Toast.makeText(this,"Ejercicio 11", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, AlmacenamientoClaseShared.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pantalla12){
            Intent intent = new Intent(MainActivity.this, ProblemaPropuesto2.class);
            startActivity(intent);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    //boton salir
    //    public void redad(View v){
    //        Intent intent = new Intent(MainActivity.this, MainActivity.class);
    //        startActivity(intent);
    //        finish();
    //    }
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}