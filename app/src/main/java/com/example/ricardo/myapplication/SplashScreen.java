package com.example.ricardo.myapplication;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity{
    private static final int I_ACCESS_FINE_LOCATION = 1 ;
    private static final int I_ACCESS_CORSE_LOCATION = 2 ;

    // Assume thisActivity is the current activity


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashScreen.this, Main2Activity.class);
                startActivity(intent);
            }

        },1500);



    }


}
