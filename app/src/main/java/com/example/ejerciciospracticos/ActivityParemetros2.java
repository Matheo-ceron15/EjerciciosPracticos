package com.example.ejerciciospracticos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class ActivityParemetros2 extends AppCompatActivity {
        private WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paremetros2);

        webView1= (WebView) findViewById(R.id.webView);

        Bundle bundle = getIntent().getExtras();
        String dato=bundle.getString("direccion");
        webView1.loadUrl("https://" + dato);

    }

    public void volver(View view) {
        Intent intent = new Intent(ActivityParemetros2.this, MainActivity.class);
        startActivity(intent);
    }

    public void otra(View view) {
        Intent intent = new Intent(ActivityParemetros2.this, ActivityParametros.class);
        startActivity(intent);
    }
}