package com.example.ricardo.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class Formulario extends AppCompatActivity {
Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AlertDialog.Builder builder=new AlertDialog.Builder(this);

        final CharSequence[] items = {
                  "Predicación", "Territorio 1", "Territorio 2", "Territorio 3", "Territorio 4", "Territorio 5", "Territorio 6", "Territorio 7"
                , "Territorio 8", "Territorio 9", "Territorio 10", "Territorio 11", "Territorio 12", "Territorio 13", "Territorio 14"
                , "Territorio 15", "Territorio 16", "Territorio 17", "Territorio 18", "Territorio 19", "Territorio 20", "Territorio 21"
                , "Territorio 22", "Territorio 23", "Territorio 24", "Territorio 25", "Territorio 26"
        };


        builder.setCancelable(true);
        builder.setIcon(R.mipmap.icon);


        builder.setItems(items,  new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)  {
                switch (which) {

                    case 0:
                        Intent predi = new Intent(Formulario.this, Predicacion.class );
                        startActivity(predi);
                        break;
                    case 1:
                        Intent terr1 = new Intent(Formulario.this, Terr1.class );
                        startActivity(terr1);
                        break;
                    case 2:
                        Intent terr2 = new Intent(Formulario.this, Terr2.class );
                        startActivity(terr2);
                        break;
                    case 3:
                        Intent terr3 = new Intent(Formulario.this, terr3.class );
                        startActivity(terr3);
                        break;
                    case 4:
                        Intent terr4 = new Intent(Formulario.this, Terr4.class );
                        startActivity(terr4);
                        break;
                    case 5:
                        Intent terr5 = new Intent(Formulario.this, Terr5.class );
                        startActivity(terr5);
                        break;
                    case 6:
                        Intent terr6 = new Intent(Formulario.this, Terr6.class );
                        startActivity(terr6);
                        break;
                    case 7:
                        Intent terr7 = new Intent(Formulario.this, Terr7.class );
                        startActivity(terr7);
                        break;
                    case 8:
                        Intent terr8 = new Intent(Formulario.this, Terr8.class );
                        startActivity(terr8);
                        break;
                    case 9:
                        Intent terr9 = new Intent(Formulario.this, Terr9.class );
                        startActivity(terr9);
                        break;
                    case 10:
                        Intent terr10 = new Intent(Formulario.this, Terr10.class );
                        startActivity(terr10);
                        break;
                    case 11:
                        Intent terr11 = new Intent(Formulario.this, Terr11.class );
                        startActivity(terr11);
                        break;
                    case 12:
                        Intent terr12 = new Intent(Formulario.this, Terr12.class );
                        startActivity(terr12);
                        break;
                    case 13:
                        Intent terr13 = new Intent(Formulario.this, Terr13.class );
                        startActivity(terr13);
                        break;
                    case 14:
                        Intent terr14 = new Intent(Formulario.this, Terr14.class );
                        startActivity(terr14);
                        break;
                    case 15:
                        Intent terr15 = new Intent(Formulario.this, Terr15.class );
                        startActivity(terr15);
                        break;
                    case 16:
                        Intent terr16 = new Intent(Formulario.this, Terr16.class );
                        startActivity(terr16);
                        break;
                    case 17:
                        Intent terr17 = new Intent(Formulario.this, Terr17.class );
                        startActivity(terr17);
                        break;
                    case 18:
                        Intent terr18 = new Intent(Formulario.this, Terr18.class );
                        startActivity(terr18);
                        break;
                    case 19:
                        Intent terr19 = new Intent(Formulario.this, Terr19.class );
                        startActivity(terr19);
                        break;
                    case 20:
                        Intent terr20 = new Intent(Formulario.this, Terr20.class );
                        startActivity(terr20);
                        break;
                    case 21:
                        Intent terr21 = new Intent(Formulario.this, Terr21.class );
                        startActivity(terr21);
                        break;
                    case 22:
                        Intent terr22 = new Intent(Formulario.this, Terr22.class );
                        startActivity(terr22);
                        break;
                    case 23:
                        Intent terr23 = new Intent(Formulario.this, Terr23.class );
                        startActivity(terr23);
                        break;
                    case 24:
                        Intent terr24 = new Intent(Formulario.this, Terr24.class );
                        startActivity(terr24);
                        break;
                    case 25:
                        Intent terr25 = new Intent(Formulario.this, Terr25.class );
                        startActivity(terr25);
                        break;
                    case 26:
                        Intent terr26 = new Intent(Formulario.this, Terr26.class );
                        startActivity(terr26);
                        break;




            }}
        });


        builder.setTitle("Selección Rapida");
        AlertDialog alert=builder.create();
        alert.show();
        }



}