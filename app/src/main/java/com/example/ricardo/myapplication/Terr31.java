package com.example.ricardo.myapplication;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
import java.util.Objects;
import java.util.Calendar;
import uk.co.senab.photoview.PhotoViewAttacher;

public class Terr31 extends AppCompatActivity implements View.OnClickListener {
    ImageView TableRow;
    PhotoViewAttacher photoViewAttacher;
    private EditText Nombre;
    android.widget.TableRow Hola;
    Switch horario;
    private TextView Fecha;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    private final Handler handler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            if(msg.arg1 == 1)
                Toast.makeText(getBaseContext(),"Rellena todos los campos :(", Toast.LENGTH_LONG).show();

        }

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terr31);
        TableRow = findViewById(R.id.img);
        Nombre = findViewById(R.id.Nombre);
        photoViewAttacher = new PhotoViewAttacher(TableRow);
        horario = findViewById(R.id.cambio);
        String Hasta = getIntent().getStringExtra("TUNO");
        Nombre.setText(Hasta + "");
        SharedPreferences preferencias = getSharedPreferences("HOLAA", Context.MODE_PRIVATE);
        Nombre.setText(preferencias.getString("lol", ""));
        Hola = findViewById(R.id.cambiocolor);
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
        Fecha = findViewById(R.id.fecha);
        Fecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int año = cal.get(Calendar.YEAR);
                int mes = cal.get(Calendar.MONTH);
                int dia = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        Terr31.this,
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

        ToggleButton toogle = findViewById(R.id.toggleButton);
        Boolean estado = toogle.isChecked();

        CheckBox chk1 = findViewById(R.id.manzana1);
        chk1.setChecked(estado);
        CheckBox chk2 = findViewById(R.id.manzana2);
        chk2.setChecked(estado);


    }

    @Override
    public void onClick(View view) {
        String manzanas = "";
        String horario = "";

        Switch horarios = findViewById(R.id.cambio);
        Boolean hr = horarios.isChecked();
        if(hr == true)
            horario = horario+"Tarde";
        else{
            horario = horario+"Mañana";
        }
        CheckBox chk = findViewById(R.id.manzana1);
        Boolean estado = chk.isChecked();
        Log.d("Estado",estado.toString());
        if(estado == true)
            manzanas = manzanas+"1,";
        chk = findViewById(R.id.manzana2);
        estado = chk.isChecked();
        if(estado == true)
            manzanas = manzanas+"2,";


        CheckBox chk2 = findViewById(R.id.manzana1);
        Boolean estado2 = chk.isChecked();
        if(estado2 == true)
            chk2 = findViewById(R.id.manzana2);
        estado2 = chk2.isChecked();
        if(estado2 == true)

            if(estado2 == true)
                manzanas = "Completo ";

        String fecha = Fecha.getText().toString().trim();
        String nombre = Nombre.getText().toString().trim();
        if(!Objects.equals(manzanas, "") && !Objects.equals(fecha, "") && !Objects.equals(nombre, "")) {
            manzanas = manzanas.substring(0, manzanas.length() - 1);
            manzanas = manzanas + ".";

            String manufacturer = Build.ID;
            SendMailtest sm = new SendMailtest(this, fecha, manzanas, horario, "Territorio 31", nombre, manufacturer);
            sm.execute();
        }
        else{
            android.os.Message msg = handler.obtainMessage();
            msg.arg1 = 1;
            handler.sendMessage(msg);
        }
    }

}