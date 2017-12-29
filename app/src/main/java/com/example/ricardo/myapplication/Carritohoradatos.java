package com.example.ricardo.myapplication;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Carritohoradatos extends AppCompatActivity {

    TextView dia, hora;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carritohoradatos);
        dia = findViewById(R.id.diaelejido);
        hora = findViewById(R.id.horarioelejido);
        ok = findViewById(R.id.conf);

        String Hasta = getIntent().getStringExtra("Hasta");
        String Desde = getIntent().getStringExtra("Desde");
        String Fecha = getIntent().getStringExtra("Fecha");

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NotificationCompat.Builder mBuilder;
                NotificationManager mNotifyMgr = (NotificationManager) getApplicationContext().getSystemService(NOTIFICATION_SERVICE);

                Intent i = new Intent(Carritohoradatos.this, Main2Activity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(Carritohoradatos.this, 0, i, 0);

                mBuilder = new NotificationCompat.Builder(getApplicationContext())
                        .setContentIntent(pendingIntent)
                        .setSmallIcon(R.mipmap.logo)
                        .setContentTitle("Titulo")
                        .setContentText("Hola que tal?")
                        .setVibrate(new long[]{100, 200, 200, 200})
                        .setAutoCancel(true);


                mNotifyMgr.notify(1, mBuilder.build());

            }
        });


        dia.setText(Fecha);
        hora.setText(Desde + " - " + Hasta);

    }
}
