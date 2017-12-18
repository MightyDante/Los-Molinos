package com.example.ricardo.myapplication;


import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;
import java.util.Objects;
import static android.os.Build.ID;
import static android.util.Log.d;
import static com.example.ricardo.myapplication.R.id.Nombre2;
import static com.example.ricardo.myapplication.R.id.amanzana1;
import static com.example.ricardo.myapplication.R.id.amanzana2;
import static com.example.ricardo.myapplication.R.id.amanzana3;
import static com.example.ricardo.myapplication.R.id.amanzana4;
import static com.example.ricardo.myapplication.R.id.amanzana5;
import static com.example.ricardo.myapplication.R.id.bmanzana1;
import static com.example.ricardo.myapplication.R.id.bmanzana2;
import static com.example.ricardo.myapplication.R.id.bmanzana3;
import static com.example.ricardo.myapplication.R.id.bmanzana4;
import static com.example.ricardo.myapplication.R.id.fecha2;

public class Terr38 extends AppCompatActivity implements View.OnClickListener{

    private Button Boton1;
    private Button Boton2;
    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private final Handler handler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            if(msg.arg1 == 1)
                Toast.makeText(getBaseContext(),"Rellena todos los campos :(", Toast.LENGTH_LONG).show();

        }

    };
    private final Handler handler2 = new Handler() {
        public void handleMessage(android.os.Message msg) {
            if(msg.arg2 == 2)
                Toast.makeText(getBaseContext(),"Rellena todos los campos :(", Toast.LENGTH_LONG).show();

        }

    };
    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terr38);



        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        Boton1 = (Button) findViewById(R.id.boton1);
    }

    public void onToogle1(View view) {

        ToggleButton toogle = (ToggleButton)findViewById(R.id.toggleButton1);
        Boolean estado = toogle.isChecked();

        CheckBox chk1 = (CheckBox)findViewById(bmanzana1);
        chk1.setChecked(estado);
        CheckBox chk2 = (CheckBox)findViewById(bmanzana2);
        chk2.setChecked(estado);
        CheckBox chk3 = (CheckBox)findViewById(bmanzana3);
        chk3.setChecked(estado);
        CheckBox chk4 = (CheckBox)findViewById(bmanzana4);
        chk4.setChecked(estado);


    }

    public void onToogle2(View view) {

        ToggleButton toogle2 = (ToggleButton)findViewById(R.id.toggleButton2);
        Boolean estado2 = toogle2.isChecked();

        CheckBox chk1 = (CheckBox)findViewById(R.id.amanzana1);
        chk1.setChecked(estado2);
        CheckBox chk2 = (CheckBox)findViewById(R.id.amanzana2);
        chk2.setChecked(estado2);
        CheckBox chk3 = (CheckBox)findViewById(R.id.amanzana3);
        chk3.setChecked(estado2);
        CheckBox chk4 = (CheckBox)findViewById(R.id.amanzana4);
        chk4.setChecked(estado2);
        CheckBox chk5 = (CheckBox)findViewById(R.id.amanzana5);
        chk5.setChecked(estado2);
    }


    @Override
    public void onClick(View view) {
        EditText Fecha;
        EditText Nombre;
        Fecha = (EditText) findViewById(R.id.fecha);
        Nombre = (EditText) findViewById(R.id.Nombre);

        String manzanas = "";

        CheckBox chk = (CheckBox) findViewById(bmanzana1);
        Boolean estado = chk.isChecked();
        d("Estado", estado.toString());
        if (estado == true)
            manzanas = manzanas + "1,";
        chk = (CheckBox) findViewById(bmanzana2);
        estado = chk.isChecked();
        if (estado == true)
            manzanas = manzanas + "2,";
        chk = (CheckBox) findViewById(bmanzana3);
        estado = chk.isChecked();
        if (estado == true)
            manzanas = manzanas + "3,";
        chk = (CheckBox) findViewById(bmanzana4);
        estado = chk.isChecked();
        if (estado == true)
            manzanas = manzanas + "4,";

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
            if(estado2 == true)
                manzanas = "Completo ";

        String fecha = Fecha.getText().toString().trim();
        String nombre = Nombre.getText().toString().trim();
        String manufacturer = ID;
        if(!Objects.equals(manzanas, "") && !Objects.equals(fecha, "") && !Objects.equals(nombre, "")) {
            manzanas = manzanas.substring(0, manzanas.length() - 1);
            manzanas = manzanas + ".";


        SendMail sm = new SendMail(this, fecha, manzanas, "Territorio 38B", nombre, manufacturer);
        sm.execute();
    }        else{
            android.os.Message msg = handler.obtainMessage();
            msg.arg2 = 2;
            handler2.sendMessage(msg);}}



    public void b2(View view) {
        EditText Fecha;
        EditText Nombre;
        Fecha = (EditText) findViewById(fecha2);
        Nombre = (EditText) findViewById(Nombre2);
        String manzanas2 = "";

        CheckBox chk = (CheckBox) findViewById(amanzana1);
        Boolean estado2 = chk.isChecked();
        d("Estado", estado2.toString());
        if (estado2 == true)
            manzanas2 = manzanas2 + "1,";
        chk = (CheckBox) findViewById(amanzana2);
        estado2 = chk.isChecked();
        if (estado2 == true)
            manzanas2 = manzanas2 + "2,";
        chk = (CheckBox) findViewById(amanzana3);
        estado2 = chk.isChecked();
        if (estado2 == true)
            manzanas2 = manzanas2 + "3,";
        chk = (CheckBox) findViewById(amanzana4);
        estado2 = chk.isChecked();
        if (estado2 == true)
            manzanas2 = manzanas2 + "4,";
        chk = (CheckBox) findViewById(amanzana5);
        estado2 = chk.isChecked();
        if (estado2 == true)
            manzanas2 = manzanas2 + "5,";

        CheckBox chk3 = (CheckBox)findViewById(R.id.amanzana1);
        Boolean estado3 = chk.isChecked();
        if(estado3 == true)
            chk3 = (CheckBox)findViewById(R.id.amanzana2);
        estado3 = chk3.isChecked();
        if(estado3 == true)
            chk3 = (CheckBox)findViewById(R.id.amanzana3);
        estado3 = chk3.isChecked();
        if(estado3 == true)
            chk3 = (CheckBox)findViewById(R.id.amanzana4);
        estado3 = chk3.isChecked();
        if(estado3 == true)
            chk3 = (CheckBox)findViewById(R.id.amanzana5);
        estado3 = chk3.isChecked();
        if(estado3 == true)
            if(estado3 == true)
                manzanas2 = "Completo ";

        String fecha2 = Fecha.getText().toString().trim();
        String nombre3 = Nombre.getText().toString().trim();
        String manufacturer = ID;
        if(manzanas2 != "" && fecha2 != "" && nombre3 != "") {
            manzanas2 = manzanas2.substring(0, manzanas2.length() - 1);
            manzanas2 = manzanas2 + ".";


        SendMail sm = new SendMail(this, fecha2, manzanas2, "Territorio 38A", nombre3, manufacturer);
        sm.execute();

    }
        else{
            android.os.Message msg = handler.obtainMessage();
            msg.arg1 = 1;
            handler.sendMessage(msg);}}






    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    a38 paginaa = new a38();
                    return paginaa;

                case 1:
                    b38 paginab = new b38();
                    return paginab;


                default:
                    return null;


            }
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "38A";
                case 1:
                    return "38B";

            }
            return null;
        }

    }

}
