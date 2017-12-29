package com.example.ricardo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Comousar extends AppCompatActivity {

    Button enviarterritorio;
    Button vermapa;
    Button predicacion;
    Button internet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comousar);
        enviarterritorio = findViewById(R.id.enviar);
        vermapa = findViewById(R.id.mapa);
        predicacion = findViewById(R.id.predicacion);
        internet = findViewById(R.id.internet);



    }
    public void onClick(View v) {

        Intent enviarterritorio = new Intent(Comousar.this, cuenviarterritorio.class );
        startActivity(enviarterritorio);
    }
    public void vermapa(View v) {

        Intent vermapa = new Intent(Comousar.this, cumap.class );
        startActivity(vermapa);
    }
    public void predicacion(View v) {

        Intent predicacion = new Intent(Comousar.this, cupredicacion.class );
        startActivity(predicacion);
    }
    public void net(View v) {

        Intent internet = new Intent(Comousar.this, internet.class );
        startActivity(internet);
    }
}


