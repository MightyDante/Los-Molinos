package com.example.ricardo.myapplication;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import java.util.Calendar;
import java.util.Objects;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import uk.co.senab.photoview.PhotoViewAttacher;

import static android.os.Build.ID;
import static android.util.Log.d;
import static com.example.ricardo.myapplication.R.id.Nombre2;
import static com.example.ricardo.myapplication.R.id.amanzana1;
import static com.example.ricardo.myapplication.R.id.amanzana2;
import static com.example.ricardo.myapplication.R.id.bmanzana1;
import static com.example.ricardo.myapplication.R.id.bmanzana2;
import static com.example.ricardo.myapplication.R.id.bmanzana3;
import static com.example.ricardo.myapplication.R.id.bmanzana4;
import static com.example.ricardo.myapplication.R.id.fecha;
import static com.example.ricardo.myapplication.R.id.fecha2;

public class Terr4 extends AppCompatActivity implements View.OnClickListener{

    ImageView TableRow;
    PhotoViewAttacher photoViewAttacher;
    private EditText Nombre;
    private TextView Fecha;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    android.widget.TableRow Hola;
    Switch horario;
    @SuppressLint("HandlerLeak")
    private final Handler handler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            if(msg.arg1 == 1)
                Toast.makeText(getBaseContext(),"Rellena todos los campos :(", Toast.LENGTH_LONG).show();

        }

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.at);
        TableRow = (ImageView) findViewById(R.id.img);
        Nombre = (EditText) findViewById(R.id.Nombre);
        photoViewAttacher = new PhotoViewAttacher(TableRow);
        String Hasta = getIntent().getStringExtra("CUATRO");
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
        Fecha = (TextView) findViewById(R.id.fecha);
        Fecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int año = cal.get(Calendar.YEAR);
                int mes = cal.get(Calendar.MONTH);
                int dia = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        Terr4.this,
                        android.R.style.Theme_DeviceDefault_Light_Dialog_MinWidth,
                        mDateSetListener,
                        año,mes,dia);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));


                dialog.show();
            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int año, int mes, int dia) {
                mes = mes + 1;
                String fecha = dia + "/" + mes + "/" + año;
                Fecha.setText(fecha);
            }
        };





    }



    public void onToogle(View view) {

        ToggleButton toogle2 = (ToggleButton)findViewById(R.id.toggleButton);
        Boolean estado2 = toogle2.isChecked();
        CheckBox chk1 = (CheckBox)findViewById(R.id.amanzana1);
        chk1.setChecked(estado2);
        CheckBox chk2 = (CheckBox)findViewById(R.id.amanzana2);
        chk2.setChecked(estado2);

    }




    public void terr4a(View view) {


        String manzanas2 = "";
        String horario = "";

        Switch horarios = (Switch) findViewById(R.id.cambio);
        Boolean hr = horarios.isChecked();
        if(hr == true)
            horario = horario+"Tarde";
        else{
            horario = horario+"Mañana";
        }

        CheckBox chk = (CheckBox)findViewById(R.id.amanzana1);
        Boolean estado = chk.isChecked();

        Log.d("Estado",estado.toString());
        if(estado == true)
            manzanas2 = manzanas2+"1,";
        chk = (CheckBox)findViewById(R.id.amanzana2);
        estado = chk.isChecked();
        if(estado == true)
            manzanas2 = manzanas2+"2,";

        CheckBox chk2 = (CheckBox)findViewById(R.id.amanzana1);
        CheckBox chk3 = (CheckBox)findViewById(R.id.amanzana2);

        Boolean estado3 = chk2.isChecked();
        Boolean estado2 = chk3.isChecked();
        if(estado3 == true)

        estado2 = chk3.isChecked();
        if(estado2 == true)
            if(estado3 && estado2 == true)
                manzanas2 = "Completo ";

        String fecha = Fecha.getText().toString().trim();
        String nombre = Nombre.getText().toString().trim();
        String manufacturer = ID;
        if(!Objects.equals(manzanas2, "") && !Objects.equals(fecha, "") && !Objects.equals(nombre, "")) {
            manzanas2 = manzanas2.substring(0, manzanas2.length() - 1);
            manzanas2 = manzanas2 + ".";


            SendMailtest sm = new SendMailtest(this, fecha, manzanas2, horario, "Territorio 4A", nombre, manufacturer);
            sm.execute();
        }        else{
            android.os.Message msg = handler.obtainMessage();
            msg.arg2 = 1;
            handler.sendMessage(msg);}}


    @Override
    public void onClick(View view) {

    }
}
