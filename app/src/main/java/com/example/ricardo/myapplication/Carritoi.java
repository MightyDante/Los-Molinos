package com.example.ricardo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.example.ricardo.myapplication.mapas.ubicaciondecdcarro;

public class Carritoi extends AppCompatActivity {

    ImageButton puntos;
    ImageButton horas;
    ImageButton ubi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carritoi);
        puntos = (ImageButton) findViewById(R.id.puntos);
        horas = (ImageButton) findViewById(R.id.hora);
        ubi = (ImageButton) findViewById(R.id.ubic);

        puntos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent puntos = new Intent(Carritoi.this, CarritoPuntos.class );
                startActivity(puntos);
                overridePendingTransition(R.anim.left_anim, R.anim.left_anim_out);


            }
        });

                horas.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                        Intent horas = new Intent(Carritoi.this, CarritoSH.class );
                        startActivity(horas);
                        overridePendingTransition(R.anim.left_anim, R.anim.left_anim_out);


                    }
                }
        );

        ubi.setOnClickListener(new View.OnClickListener() {

                                     @Override
                                     public void onClick(View v) {

                                         Intent ubi = new Intent(Carritoi.this, ubicaciondecdcarro.class );
                                         startActivity(ubi);
                                         overridePendingTransition(R.anim.left_anim, R.anim.left_anim_out);


                                     }
                                 }
        );

    }
}
