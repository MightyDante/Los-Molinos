package com.example.ricardo.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.BoolRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

import uk.co.senab.photoview.PhotoViewAttacher;

import static android.os.Build.ID;
import static android.util.Log.d;
import static com.example.ricardo.myapplication.R.id;
import static com.example.ricardo.myapplication.R.id.manzana1;

public class Terr41 extends AppCompatActivity implements View.OnClickListener {
    ImageView TableRow;
    PhotoViewAttacher photoViewAttacher;
    private EditText Fecha;
    private EditText Nombre;
    android.widget.TableRow Hola;
    Switch horario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terr41);
        Nombre = (EditText) findViewById(R.id.Nombre);

        TableRow = (ImageView) findViewById(R.id.img);
        String Hasta = getIntent().getStringExtra("CUNO");
        Nombre.setText(Hasta + "");
        SharedPreferences preferencias = getSharedPreferences("HOLAA", Context.MODE_PRIVATE);
        Nombre.setText(preferencias.getString("lol", ""));
        horario = (Switch) findViewById(R.id.cambio);
        Hola = (android.widget.TableRow) findViewById(R.id.cambiocolor);
        horario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                horario.isChecked();

                if(horario.isChecked()){
                    Hola.setBackgroundColor(Color.parseColor("#00325B"));}
                else{
                    Hola.setBackgroundColor(Color.parseColor("#FF03A29D"));}
            }
        });
        Picasso.with(this)
                .load("http://creadlechile.cl/terr41.png")
                .error(R.mipmap.mantencion)
                .fit()
                .memoryPolicy(MemoryPolicy.NO_CACHE)
                .networkPolicy(NetworkPolicy.NO_CACHE)
                .centerInside()

                .into(TableRow);
        Fecha = (EditText) findViewById(R.id.fecha);
        photoViewAttacher = new PhotoViewAttacher(TableRow);

    }

    public void onToogle(View view) {

        ToggleButton toogle = (ToggleButton)findViewById(R.id.toggleButton);
        Boolean estado = toogle.isChecked();

        CheckBox chk1 = (CheckBox)findViewById(R.id.manzana1);
        chk1.setChecked(estado);


    }

    @Override
    public void onClick(View view) {
        String manzanas = "";
        String horario = "";

        Switch horarios = (Switch) findViewById(R.id.cambio);
        Boolean hr = horarios.isChecked();
        if(hr == true)
            horario = horario+"Tarde";
        else{
            horario = horario+"Mañana";
        }
        CheckBox chk = (CheckBox) findViewById(manzana1);
        Boolean estado = chk.isChecked();
        d("Estado", estado.toString());
        if (estado == true)
            manzanas = manzanas + "1,";


        if (manzanas != "") {
            manzanas = manzanas.substring(0, manzanas.length() - 1);
            manzanas = manzanas + ".";
        }
        d("Manzanas", manzanas);
        String fecha = Fecha.getText().toString().trim();
        String nombre = Nombre.getText().toString().trim();
        String manufacturer = ID;


        SendMailtest sm = new SendMailtest(this, fecha, manzanas, horario, "Territorio 41", nombre, manufacturer);
        sm.execute();
    }

}