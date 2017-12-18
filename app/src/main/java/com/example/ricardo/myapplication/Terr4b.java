package com.example.ricardo.myapplication;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Calendar;
import java.util.Objects;

import uk.co.senab.photoview.PhotoViewAttacher;

import static android.os.Build.ID;

public class Terr4b extends AppCompatActivity implements View.OnClickListener{

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
        setContentView(R.layout.bt);
        TableRow = (ImageView) findViewById(R.id.img2);
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
                        Terr4b.this,
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

        ToggleButton toogle = (ToggleButton)findViewById(R.id.toggleButton1);
        Boolean estado = toogle.isChecked();

        CheckBox chk1 = (CheckBox)findViewById(R.id.bmanzana1);
        chk1.setChecked(estado);
        CheckBox chk2 = (CheckBox)findViewById(R.id.bmanzana2);
        chk2.setChecked(estado);
        CheckBox chk3 = (CheckBox)findViewById(R.id.bmanzana3);
        chk3.setChecked(estado);
        CheckBox chk4 = (CheckBox)findViewById(R.id.bmanzana4);
        chk4.setChecked(estado);
        CheckBox chk5 = (CheckBox)findViewById(R.id.bmanzana5);
        chk5.setChecked(estado);
        CheckBox chk6 = (CheckBox)findViewById(R.id.bmanzana6);
        chk6.setChecked(estado);
        CheckBox chk7 = (CheckBox)findViewById(R.id.bmanzana7);
        chk7.setChecked(estado);

    }




    public void terr4b(View view) {


        String manzanas2 = "";
        String horario = "";

        Switch horarios = (Switch) findViewById(R.id.cambio);
        Boolean hr = horarios.isChecked();
        if(hr == true)
            horario = horario+"Tarde";
        else{
            horario = horario+"Mañana";
        }

        CheckBox chk = (CheckBox)findViewById(R.id.bmanzana1);
        Boolean estado = chk.isChecked();
        Log.d("Estado",estado.toString());
        if(estado == true)
            manzanas2 = manzanas2+"1,";
        chk = (CheckBox)findViewById(R.id.bmanzana2);
        estado = chk.isChecked();
        if(estado == true)
            manzanas2 = manzanas2+"2,";

        chk = (CheckBox)findViewById(R.id.bmanzana3);
        estado = chk.isChecked();
        if(estado == true)
            manzanas2 = manzanas2+"3,";

        chk = (CheckBox)findViewById(R.id.bmanzana4);
        estado = chk.isChecked();
        if(estado == true)
            manzanas2 = manzanas2+"4,";

        chk = (CheckBox)findViewById(R.id.bmanzana5);
        estado = chk.isChecked();
        if(estado == true)
            manzanas2 = manzanas2+"5,";

        chk = (CheckBox)findViewById(R.id.bmanzana6);
        estado = chk.isChecked();
        if(estado == true)
            manzanas2 = manzanas2+"6,";

        chk = (CheckBox)findViewById(R.id.bmanzana7);
        estado = chk.isChecked();
        if(estado == true)
            manzanas2 = manzanas2+"7,";

        CheckBox chk2 = (CheckBox)findViewById(R.id.bmanzana1);
        Boolean estado2 = chk.isChecked();
        if(estado2 == true)
            chk2 = (CheckBox)findViewById(R.id.bmanzana2);
        estado2 = chk2.isChecked();
        if(estado2 == true)
            chk2 = (CheckBox)findViewById(R.id.bmanzana3);
        estado2 = chk2.isChecked();
        if(estado2 == true)
            chk2 = (CheckBox)findViewById(R.id.bmanzana4);
        estado2 = chk2.isChecked();
        if(estado2 == true)
            chk2 = (CheckBox)findViewById(R.id.bmanzana5);
        estado2 = chk2.isChecked();
        if(estado2 == true)
            chk2 = (CheckBox)findViewById(R.id.bmanzana6);
        estado2 = chk2.isChecked();
        if(estado2 == true)
            chk2 = (CheckBox)findViewById(R.id.bmanzana7);
        estado2 = chk2.isChecked();
        if(estado2 == true)
            if(estado2 == true)
                manzanas2 = "Completo ";

        String fecha = Fecha.getText().toString().trim();
        String nombre = Nombre.getText().toString().trim();
        String manufacturer = ID;
        if(!Objects.equals(manzanas2, "") && !Objects.equals(fecha, "") && !Objects.equals(nombre, "")) {
            manzanas2 = manzanas2.substring(0, manzanas2.length() - 1);
            manzanas2 = manzanas2 + ".";


            SendMailtest sm = new SendMailtest(this, fecha, manzanas2, horario, "Territorio 4B", nombre, manufacturer);
            sm.execute();
        }        else{
            android.os.Message msg = handler.obtainMessage();
            msg.arg1 = 1;
            handler.sendMessage(msg);}}


    @Override
    public void onClick(View view) {

    }
}
