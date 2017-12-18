package com.example.ricardo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import uk.co.senab.photoview.PhotoViewAttacher;
public class Mapa extends AppCompatActivity {

    ImageView Mapa;
    PhotoViewAttacher photoViewAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        Mapa = (ImageView) findViewById(R.id.mapa);
        photoViewAttacher = new PhotoViewAttacher(Mapa);
        photoViewAttacher.setMaximumScale(10);



    }
}
