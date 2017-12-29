package com.example.ricardo.myapplication;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import android.widget.Toast;
import java.util.Calendar;
import java.util.Objects;

import static com.example.ricardo.myapplication.R.id.hora2;



public class CarritoSH extends AppCompatActivity {
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    private TextView Fecha;
    private TextView hrs;
    private TextView hrs2;

    Button sig;
    private  int hora,minutos;
    @SuppressLint("HandlerLeak")
    private final Handler handler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            if(msg.arg1 == 1)
                Toast.makeText(getBaseContext(),"Rellena todos los campos :(", Toast.LENGTH_LONG).show();

        }

    };

    @Override
    protected void onCreate(Bundle

                                        savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carritohora);
        hrs = findViewById(R.id.hora);
        hrs2 = findViewById(hora2);
        sig = findViewById(R.id.bsiguiente);


        Fecha = findViewById(R.id.fecha);
        Fecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int año = cal.get(Calendar.YEAR);
                int mes = cal.get(Calendar.MONTH);
                int dia = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        CarritoSH.this,
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


    public void holanda(View v) {
            final Calendar c= Calendar.getInstance();
            hora=c.get(Calendar.HOUR_OF_DAY);
            minutos=c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    minute = 0;
                    String hora1 = String.valueOf(hourOfDay + ":" +minute+"0");
                    hrs.setText(hora1);


                }
            },hora,minutos,true);
            timePickerDialog.show();
        }

    public void holanda2(View v) {
        final Calendar c= Calendar.getInstance();
        hora=c.get(Calendar.HOUR_OF_DAY);
        minutos=c.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                minute = 0;
                String hora2 = String.valueOf(hourOfDay + ":" +minute+"0");
                hrs2.setText(hora2);


            }

        },hora,minutos,true);
        timePickerDialog.show();
    }

    public void pasar(View v) {
        if(!Objects.equals(hrs2.getText(), "") && !Objects.equals(hrs.getText(), "") && !Objects.equals(Fecha.getText(), "")) {

            Intent sig = new Intent(CarritoSH.this, Carritohoradatos.class);
            sig.putExtra("Desde", hrs.getText() + "");
            sig.putExtra("Hasta", hrs2.getText() + "");
            sig.putExtra("Fecha", Fecha.getText() + "");
            startActivity(sig);
            overridePendingTransition(R.anim.left_anim, R.anim.left_anim_out);
        }
        else {
            android.os.Message msg = handler.obtainMessage();
            msg.arg1 = 1;
            handler.sendMessage(msg);}
        }

    }

