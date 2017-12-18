package com.example.ricardo.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Vibrator;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class primeroinforme extends AppCompatActivity {


    FloatingActionButton nuevo;
    Context context;
    boolean click = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeroinforme);
        nuevo = findViewById(R.id.nuevo);

        nuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click = !click;
                if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    Vibrator vibrator = (Vibrator)
                            getSystemService(Context.VIBRATOR_SERVICE);
                    if (view == nuevo) vibrator.vibrate(1);}
                Intent informe = new Intent(primeroinforme.this, formulariodelinforme.class);
                startActivity(informe);
                overridePendingTransition(R.anim.left_anim, R.anim.left_anim_out);


            }
        });
    }

}
