package com.example.ricardo.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Objects;


public class Configuracion extends AppCompatActivity  {

    Switch ACT;
    TextView Nombre, test;

    private String PREFS_KEY = "mispreferencias";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
        ACT =  findViewById(R.id.act);
        test = findViewById(R.id.test);

        SharedPreferences preferencias = getSharedPreferences("HOLAA", Context.MODE_PRIVATE);
        test.setText(preferencias.getString("hi", ""));
        boolean estado_switch = getValuePreference(getApplicationContext());
        ACT.setChecked(estado_switch);

        ACT.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                saveValuePreference(getApplicationContext(), isChecked);




                if(isChecked){

                    AlertDialog.Builder builder=new AlertDialog.Builder(Configuracion.this);
                    builder.setCancelable(true);
                    builder.setIcon(R.mipmap.icon);
                    builder.setTitle("Ingresa un Nombre");
                    final EditText input = new EditText(Configuracion.this);
                    builder.setView(input);


                    builder.setPositiveButton("Listo",new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            String nombre = input.getText().toString();
                            test.setText(nombre);
                            test.setBackgroundColor(Color.parseColor("#cb6232"));

                            SharedPreferences preferencias = getSharedPreferences("HOLAA", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = preferencias.edit();
                            editor.putString("lol", nombre);
                            editor.putString("hi", test.getText().toString());
                            editor.commit();


                            Intent a = new Intent(Configuracion.this, Terr1.class);
                            a.putExtra("UNO", nombre);
                            Intent s = new Intent(Configuracion.this, Terr2.class);
                            s.putExtra("DOS", nombre);
                            Intent d = new Intent(Configuracion.this, terr3.class);
                            d.putExtra("TRES", nombre);
                            Intent f = new Intent(Configuracion.this, Terr4.class);
                            f.putExtra("CUATRO", nombre);
                            Intent g = new Intent(Configuracion.this, Terr5.class);
                            g.putExtra("CINCO", nombre);
                            Intent h = new Intent(Configuracion.this, Terr6.class);
                            h.putExtra("SEIS", nombre);
                            Intent w = new Intent(Configuracion.this, Terr7.class);
                            w.putExtra("SIETE", nombre);
                            Intent e = new Intent(Configuracion.this, Terr8.class);
                            e.putExtra("OCHO", nombre);
                            Intent r = new Intent(Configuracion.this, Terr9.class);
                            r.putExtra("NUEVE", nombre);
                            Intent t = new Intent(Configuracion.this, Terr10.class);
                            t.putExtra("DIEZ", nombre);
                            Intent y = new Intent(Configuracion.this, Terr11.class);
                            y.putExtra("ONCE", nombre);
                            Intent u = new Intent(Configuracion.this, Terr12.class);
                            u.putExtra("DOCE", nombre);
                            Intent o = new Intent(Configuracion.this, Terr13.class);
                            o.putExtra("TRECE", nombre);
                            Intent p = new Intent(Configuracion.this, Terr14.class);
                            p.putExtra("CATORCE", nombre);
                            Intent z = new Intent(Configuracion.this, Terr15.class);
                            z.putExtra("QUINCE", nombre);
                            Intent x = new Intent(Configuracion.this, Terr16.class);
                            x.putExtra("DSEIS", nombre);
                            Intent c = new Intent(Configuracion.this, Terr17.class);
                            c.putExtra("DSIETE", nombre);
                            Intent v = new Intent(Configuracion.this, Terr18.class);
                            v.putExtra("DOCHO", nombre);
                            Intent b = new Intent(Configuracion.this, Terr19.class);
                            b.putExtra("DNUEVE", nombre);
                            Intent n = new Intent(Configuracion.this, Terr20.class);
                            n.putExtra("V", nombre);
                            Intent m = new Intent(Configuracion.this, Terr21.class);
                            m.putExtra("VUNO", nombre);
                            Intent as = new Intent(Configuracion.this, Terr22.class);
                            as.putExtra("VDOS", nombre);
                            Intent ass = new Intent(Configuracion.this, Terr23.class);
                            ass.putExtra("VTRES", nombre);
                            Intent ad = new Intent(Configuracion.this, Terr24.class);
                            ad.putExtra("VCUATRO", nombre);
                            Intent add = new Intent(Configuracion.this, Terr25.class);
                            add.putExtra("VCINCO", nombre);
                            Intent ag = new Intent(Configuracion.this, Terr26.class);
                            ag.putExtra("VSEIS", nombre);
                            Intent ags = new Intent(Configuracion.this, Terr27.class);
                            ags.putExtra("VSIETE", nombre);
                            Intent ax = new Intent(Configuracion.this, Terr28.class);
                            ax.putExtra("VOCHO", nombre);
                            Intent axx = new Intent(Configuracion.this, Terr29.class);
                            axx.putExtra("VNUEVE", nombre);
                            Intent acc = new Intent(Configuracion.this, Terr30.class);
                            acc.putExtra("T", nombre);
                            Intent ac = new Intent(Configuracion.this, Terr31.class);
                            ac.putExtra("TUNO", nombre);
                            Intent avvv = new Intent(Configuracion.this, Terr32.class);
                            avvv.putExtra("TDOS", nombre);
                            Intent avv = new Intent(Configuracion.this, Terr33.class);
                            avv.putExtra("TTRES", nombre);
                            Intent avvvv = new Intent(Configuracion.this, Terr34.class);
                            avvvv.putExtra("TCUATRO", nombre);
                            Intent av = new Intent(Configuracion.this, Terr35.class);
                            av.putExtra("TCINCO", nombre);
                            Intent aq = new Intent(Configuracion.this, Terr36.class);
                            aq.putExtra("TSEIS", nombre);
                            Intent accc = new Intent(Configuracion.this, Terr37.class);
                            accc.putExtra("TSIETE", nombre);
                            Intent gg = new Intent(Configuracion.this, Terr38.class);
                            gg.putExtra("TOCHO", nombre);
                            Intent gd = new Intent(Configuracion.this, Terr39.class);
                            gd.putExtra("TNUEVE", nombre);
                            Intent ggg = new Intent(Configuracion.this, Terr40.class);
                            ggg.putExtra("C", nombre);
                            Intent mmm = new Intent(Configuracion.this, Terr41.class);
                            mmm.putExtra("CUNO", nombre);
                            test.setBackgroundColor(Color.parseColor("#cb6232"));

                        }


                    });

                    builder.setNegativeButton("Cancelar",new DialogInterface.OnClickListener()
                    {

                        @Override
                        public void onClick(DialogInterface dialog, int which)
                        {

                            dialog.dismiss();
                            ACT.setChecked(false);

                        }
                    });
                    AlertDialog alert=builder.create();

                    alert.show();


                }
                else{
                    getSharedPreferences("HOLAA",MODE_PRIVATE).edit().clear().apply();
                    test.setText("Ingresa un Nombre");


                }
            }
        });






    }
    public void saveValuePreference(Context context, boolean valor) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_KEY, MODE_PRIVATE);
        SharedPreferences.Editor editor;
        editor = settings.edit();
        editor.putBoolean("estado_switch", valor);
        editor.commit();


    }
    public boolean getValuePreference(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(PREFS_KEY, MODE_PRIVATE);
        return  preferences.getBoolean("estado_switch", false);


    }




}
