package com.example.ricardo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.ricardo.myapplication.mapas.punto1;
import com.example.ricardo.myapplication.mapas.punto2;
import com.example.ricardo.myapplication.mapas.punto3;
import com.example.ricardo.myapplication.mapas.punto4;
import com.example.ricardo.myapplication.mapas.punto5;
import com.example.ricardo.myapplication.mapas.punto6;
import com.example.ricardo.myapplication.mapas.punto7;



public class CarritoPuntos extends AppCompatActivity {
    Button uno;
    Button dos;
    Button tres;
    Button cuatro;
    Button cinco;
    Button seis;
    Button siete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carritopuntos);
        uno =(Button)findViewById(R.id.uno);
        dos =(Button)findViewById(R.id.dos);
        tres =(Button)findViewById(R.id.tres);
        cuatro =(Button)findViewById(R.id.cuatro);
        cinco =(Button)findViewById(R.id.cinco);
        seis =(Button)findViewById(R.id.seis);
        siete =(Button)findViewById(R.id.siete);


        uno.setOnClickListener(new View.OnClickListener() {

                                         @Override
                                         public void onClick(View v) {

                                             Intent uno = new Intent(CarritoPuntos.this, punto1.class );
                                             startActivity(uno);
                                             overridePendingTransition(R.anim.left_anim, R.anim.left_anim_out);

                                         }
                                     }

        );

        dos.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       Intent dos = new Intent(CarritoPuntos.this, punto2.class );
                                       startActivity(dos);
                                       overridePendingTransition(R.anim.left_anim, R.anim.left_anim_out);

                                   }
                               }

        );

        tres.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       Intent tres = new Intent(CarritoPuntos.this, punto3.class );
                                       startActivity(tres);
                                       overridePendingTransition(R.anim.left_anim, R.anim.left_anim_out);

                                   }
                               }

        );

        cuatro.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       Intent cuatro = new Intent(CarritoPuntos.this, punto4.class );
                                       startActivity(cuatro);
                                       overridePendingTransition(R.anim.left_anim, R.anim.left_anim_out);

                                   }
                               }

        );

        cinco.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       Intent cinco = new Intent(CarritoPuntos.this, punto5.class );
                                       startActivity(cinco);
                                       overridePendingTransition(R.anim.left_anim, R.anim.left_anim_out);

                                   }
                               }

        );

        seis.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       Intent seis = new Intent(CarritoPuntos.this, punto6.class );
                                       startActivity(seis);
                                       overridePendingTransition(R.anim.left_anim, R.anim.left_anim_out);

                                   }
                               }

        );

        siete.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {

                                       Intent siete = new Intent(CarritoPuntos.this, punto7.class );
                                       startActivity(siete);
                                       overridePendingTransition(R.anim.left_anim, R.anim.left_anim_out);

                                   }
                               }

        );


    }
}
