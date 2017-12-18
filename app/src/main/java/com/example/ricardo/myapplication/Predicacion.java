package com.example.ricardo.myapplication;

import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.MediaScannerConnection;
import android.media.MediaScannerConnection.OnScanCompletedListener;
import android.net.Uri;
import android.os.Environment;
import android.os.Vibrator;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import uk.co.senab.photoview.PhotoViewAttacher;

import static android.media.MediaScannerConnection.scanFile;

public class Predicacion extends AppCompatActivity  {
    ImageView predicacion;
    Button direcciones;
    PhotoViewAttacher photoViewAttacher;
    RelativeLayout hola;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predicacion);
        predicacion = findViewById(R.id.img);
        direcciones = findViewById(R.id.direcciones2);
        photoViewAttacher = new PhotoViewAttacher(predicacion);
        hola = findViewById(R.id.hola);
        hola.setBackgroundResource(R.mipmap.fondocarga);

        Picasso.with(this)

                .load("http://creadlechile.cl/predicacion.jpeg")
                .error(R.mipmap.predimantencion)
                .fit()
                .memoryPolicy(MemoryPolicy.NO_STORE)
                .networkPolicy(NetworkPolicy.NO_CACHE)
                .centerInside()
                .into(predicacion);



        direcciones.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent dire = new Intent(Predicacion.this, Direcciones.class );
                                                startActivity(dire);
                                            }
                                        }
        );
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.menu_predicacion, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public void onBackPressed() {
        Intent inte = new Intent();
        inte.setClass(Predicacion.this, Main2Activity.class);
        startActivity(inte);
        finish();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {

            case R.id.anterior:
                Intent intent = new Intent(Predicacion.this, antpredicacion.class);
                startActivity(intent);
                overridePendingTransition(R.anim.right_anim, R.anim.right_anim_out);

                return true;

            case R.id.siguiente:
                Intent intent2 = new Intent(Predicacion.this, dsppredicacion.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.left_anim, R.anim.left_anim_out);

                return true;


            default:
                return super.onOptionsItemSelected(item);
        }

    }



}
