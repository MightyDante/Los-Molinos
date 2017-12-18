package com.example.ricardo.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class thisand4 extends AppCompatActivity implements View.OnClickListener{

    ImageButton a;
    ImageButton b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuatroaob);
        a = (ImageButton) findViewById(R.id.ta);
        b = (ImageButton) findViewById(R.id.tb);


    }

    @Override
    public void onClick(View view) {

    }

}
