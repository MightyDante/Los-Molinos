package com.example.ricardo.myapplication;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Vibrator;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {
    private static final int INTERVALO = 2000; //2 segundos para salir
    private long tiempoPrimerClick;
    private static final int I_ACCESS_FINE_LOCATION = 0;
    private static final int I_ACCESS_COARSE_LOCATION = 1;
    boolean click = false;
    Context context;
    FloatingActionButton fab;
    ImageButton mapa;
    ImageButton carrito;
    ImageButton predicacion;
    ImageButton territorio1;
    ImageButton territorio2;
    ImageButton territorio3;
    ImageButton territorio4;
    ImageButton territorio5;
    ImageButton territorio6;
    ImageButton territorio7;
    ImageButton territorio8;
    ImageButton territorio9;
    ImageButton territorio10;
    ImageButton territorio11;
    ImageButton territorio12;
    ImageButton territorio13;
    ImageButton territorio14;
    ImageButton territorio15;
    ImageButton territorio16;
    ImageButton territorio17;
    ImageButton territorio18;
    ImageButton territorio19;
    ImageButton territorio20;
    ImageButton territorio21;
    ImageButton territorio22;
    ImageButton territorio23;
    ImageButton territorio24;
    ImageButton territorio25;
    ImageButton territorio26;
    ImageButton territorio27;
    ImageButton territorio28;
    ImageButton territorio29;
    ImageButton territorio30;
    ImageButton territorio31;
    ImageButton territorio32;
    ImageButton territorio33;
    ImageButton territorio34;
    ImageButton territorio35;
    ImageButton territorio36;
    ImageButton territorio37;
    ImageButton territorio38;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Boolean isFirstRun =
                getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                        .getBoolean("isFirstRun", true);


        if (isFirstRun) {

            startActivity(new Intent(Main2Activity.this, Tut1.class));

        }

        getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
                .putBoolean("isFirstRun", false).commit();

// Here, thisActivity is the current activity
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.ACCESS_FINE_LOCATION)) {

                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.

            } else {

                // No explanation needed, we can request the permission.

                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        I_ACCESS_FINE_LOCATION);

                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                // app-defined int constant. The callback method gets the
                // result of the request.
            }
        }


        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.ACCESS_COARSE_LOCATION)) {

                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.

            } else {

                // No explanation needed, we can request the permission.

                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.ACCESS_COARSE_LOCATION},
                        I_ACCESS_COARSE_LOCATION);

                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                // app-defined int constant. The callback method gets the
                // result of the request.
            }
        }

        setContentView(R.layout.activity_main2);
        mapa = findViewById(R.id.mapa);
        carrito = findViewById(R.id.carrito);
        predicacion = findViewById(R.id.predicacion);
        territorio1 = findViewById(R.id.terr1);
        territorio2 = findViewById(R.id.terr2);
        territorio3 = findViewById(R.id.terr3);
        territorio4 = findViewById(R.id.terr4);
        territorio5 = findViewById(R.id.terr5);
        territorio6 = findViewById(R.id.terr6);
        territorio7 = findViewById(R.id.terr7);
        territorio8 = findViewById(R.id.terr8);
        territorio9 = findViewById(R.id.terr9);
        territorio10 = findViewById(R.id.terr10);
        territorio11 = findViewById(R.id.terr11);
        territorio12 = findViewById(R.id.terr12);
        territorio13 = findViewById(R.id.terr13);
        territorio14 = findViewById(R.id.terr14);
        territorio15 = findViewById(R.id.terr15);
        territorio16 = findViewById(R.id.terr16);
        territorio17 = findViewById(R.id.terr17);
        territorio18 = findViewById(R.id.terr18);
        territorio19 = findViewById(R.id.terr19);
        territorio20 = findViewById(R.id.terr20);
        territorio21 = findViewById(R.id.terr21);
        territorio22 = findViewById(R.id.terr22);
        territorio23 = findViewById(R.id.terr23);
        territorio24 = findViewById(R.id.terr24);
        territorio25 = findViewById(R.id.terr25);
        territorio26 = findViewById(R.id.terr26);
        territorio27 = findViewById(R.id.terr27);
        territorio28 = findViewById(R.id.terr28);
        territorio29 = findViewById(R.id.terr29);
        territorio30 = findViewById(R.id.terr30);
        territorio31 = findViewById(R.id.terr31);
        territorio32 = findViewById(R.id.terr32);
        territorio33 = findViewById(R.id.terr33);
        territorio34 = findViewById(R.id.terr34);
        territorio35 = findViewById(R.id.terr35);
        territorio36 = findViewById(R.id.terr36);
        territorio37 = findViewById(R.id.terr37);
        territorio38 = findViewById(R.id.terr38);

        fab = findViewById(R.id.jol);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click = !click;
                Vibrator vibrator = (Vibrator)
                        getSystemService(Context.VIBRATOR_SERVICE);
                if (view == fab) vibrator.vibrate(1);
                Intent dire = new Intent(Main2Activity.this, Informe.class);
                startActivity(dire);


            }
        });


        carrito.setOnClickListener(new View.OnClickListener() {

                                       @Override
                                       public void onClick(View v) {

                                           Intent carrito = new Intent(Main2Activity.this, Carritoi.class);
                                           startActivity(carrito);
                                       }
                                   }

        );

        territorio1.setOnClickListener(new View.OnClickListener() {

                                           @Override
                                           public void onClick(View v) {

                                               Intent territorio1 = new Intent(Main2Activity.this, Terr1.class);
                                               startActivity(territorio1);
                                           }
                                       }

        );


        territorio2.setOnClickListener(new View.OnClickListener() {

                                           @Override
                                           public void onClick(View v) {

                                               Intent territorio2 = new Intent(Main2Activity.this, Terr2.class);
                                               startActivity(territorio2);
                                           }
                                       }
        );


        territorio3.setOnClickListener(new View.OnClickListener() {

                                           @Override
                                           public void onClick(View v) {

                                               Intent territorio3 = new Intent(Main2Activity.this, terr3.class);
                                               startActivity(territorio3);
                                           }
                                       }
        );


        territorio4.setOnClickListener(new View.OnClickListener() {

                                           @Override
                                           public void onClick(View v) {
                                               Intent territorio4 = new Intent(Main2Activity.this, Terr4.class);
                                               startActivity(territorio4);


                                           }
                                       }
        );

        territorio5.setOnClickListener(new View.OnClickListener() {

                                           @Override
                                           public void onClick(View v) {

                                               Intent territorio5 = new Intent(Main2Activity.this, Terr5.class);
                                               startActivity(territorio5);
                                           }
                                       }
        );


        territorio6.setOnClickListener(new View.OnClickListener() {

                                           @Override
                                           public void onClick(View v) {

                                               Intent territorio6 = new Intent(Main2Activity.this, Terr6.class);
                                               startActivity(territorio6);
                                           }
                                       }
        );

        territorio7.setOnClickListener(new View.OnClickListener() {

                                           @Override
                                           public void onClick(View v) {

                                               Intent territorio7 = new Intent(Main2Activity.this, Terr7.class);
                                               startActivity(territorio7);
                                           }
                                       }
        );


        territorio8.setOnClickListener(new View.OnClickListener() {

                                           @Override
                                           public void onClick(View v) {

                                               Intent territorio8 = new Intent(Main2Activity.this, Terr8.class);
                                               startActivity(territorio8);
                                           }
                                       }
        );


        territorio9.setOnClickListener(new View.OnClickListener() {

                                           @Override
                                           public void onClick(View v) {

                                               Intent territorio9 = new Intent(Main2Activity.this, Terr9.class);
                                               startActivity(territorio9);
                                           }
                                       }
        );


        territorio10.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio10 = new Intent(Main2Activity.this, Terr10.class);
                                                startActivity(territorio10);
                                            }
                                        }
        );


        territorio11.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio11 = new Intent(Main2Activity.this, Terr11.class);
                                                startActivity(territorio11);
                                            }
                                        }
        );

        territorio12.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio12 = new Intent(Main2Activity.this, Terr12.class);
                                                startActivity(territorio12);
                                            }
                                        }
        );


        territorio13.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio13 = new Intent(Main2Activity.this, Terr13.class);
                                                startActivity(territorio13);
                                            }
                                        }
        );


        territorio14.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio14 = new Intent(Main2Activity.this, Terr14.class);
                                                startActivity(territorio14);
                                            }
                                        }
        );


        territorio15.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio15 = new Intent(Main2Activity.this, Terr15.class);
                                                startActivity(territorio15);
                                            }
                                        }
        );

        mapa.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View v) {

                                        Intent mapa = new Intent(Main2Activity.this, Mapa.class);
                                        startActivity(mapa);
                                    }
                                }
        );


//

        territorio16.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio16 = new Intent(Main2Activity.this, Terr16.class);
                                                startActivity(territorio16);
                                            }
                                        }

        );


        territorio17.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio17 = new Intent(Main2Activity.this, Terr17.class);
                                                startActivity(territorio17);
                                            }
                                        }
        );


        territorio18.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio18 = new Intent(Main2Activity.this, Terr18.class);
                                                startActivity(territorio18);
                                            }
                                        }
        );


        territorio19.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio19 = new Intent(Main2Activity.this, Terr19.class);
                                                startActivity(territorio19);
                                            }
                                        }
        );

        territorio20.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio20 = new Intent(Main2Activity.this, Terr20.class);
                                                startActivity(territorio20);
                                            }
                                        }
        );


        territorio21.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio21 = new Intent(Main2Activity.this, Terr21.class);
                                                startActivity(territorio21);
                                            }
                                        }
        );

        territorio22.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio22 = new Intent(Main2Activity.this, Terr22.class);
                                                startActivity(territorio22);
                                            }
                                        }
        );


        territorio23.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio23 = new Intent(Main2Activity.this, Terr23.class);
                                                startActivity(territorio23);
                                            }
                                        }
        );


        territorio24.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio24 = new Intent(Main2Activity.this, Terr24.class);
                                                startActivity(territorio24);
                                            }
                                        }
        );


        territorio25.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio25 = new Intent(Main2Activity.this, Terr25.class);
                                                startActivity(territorio25);
                                            }
                                        }
        );


        territorio26.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio26 = new Intent(Main2Activity.this, Terr26.class);
                                                startActivity(territorio26);
                                            }
                                        }
        );

        territorio27.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio27 = new Intent(Main2Activity.this, Terr27.class);
                                                startActivity(territorio27);
                                            }
                                        }
        );


        territorio28.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio28 = new Intent(Main2Activity.this, Terr28.class);
                                                startActivity(territorio28);
                                            }
                                        }
        );


        territorio29.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio29 = new Intent(Main2Activity.this, Terr29.class);
                                                startActivity(territorio29);
                                            }
                                        }
        );


        territorio30.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio30 = new Intent(Main2Activity.this, Terr30.class);
                                                startActivity(territorio30);
                                            }
                                        }
        );


        territorio31.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio31 = new Intent(Main2Activity.this, Terr31.class);
                                                startActivity(territorio31);
                                            }
                                        }
        );


        territorio32.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio32 = new Intent(Main2Activity.this, Terr32.class);
                                                startActivity(territorio32);
                                            }
                                        }
        );


        territorio33.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio33 = new Intent(Main2Activity.this, Terr33.class);
                                                startActivity(territorio33);
                                            }
                                        }
        );

        territorio34.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio34 = new Intent(Main2Activity.this, Terr34.class);
                                                startActivity(territorio34);
                                            }
                                        }
        );

        territorio35.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio35 = new Intent(Main2Activity.this, Terr35.class);
                                                startActivity(territorio35);
                                            }
                                        }
        );


        territorio36.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio36 = new Intent(Main2Activity.this, Terr36.class);
                                                startActivity(territorio36);
                                            }
                                        }
        );


        territorio37.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio37 = new Intent(Main2Activity.this, Terr37.class);
                                                startActivity(territorio37);
                                            }
                                        }
        );


        territorio38.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {

                                                Intent territorio38 = new Intent(Main2Activity.this, Terr38.class);
                                                startActivity(territorio38);
                                            }
                                        }
        );





        predicacion.setOnClickListener(new View.OnClickListener() {

                                           @Override
                                           public void onClick(View v) {

                                               Intent predicacion = new Intent(Main2Activity.this, Predicacion.class);
                                               startActivity(predicacion);
                                           }
                                       }
        );


    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case I_ACCESS_FINE_LOCATION: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.

                } else {

                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
                return;
            }

            case I_ACCESS_COARSE_LOCATION: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[1] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.

                } else {

                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
            }

            // other 'case' lines to check for other
            // permissions this app might request
        }
    }


    @Override
    public void onBackPressed() {
        if (tiempoPrimerClick + INTERVALO > System.currentTimeMillis()) {
            super.onBackPressed();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                finishAffinity();
            }
        } else {
            Toast.makeText(this, "Vuelva a presionar para salir", Toast.LENGTH_SHORT).show();
        }
        tiempoPrimerClick = System.currentTimeMillis();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_terrx4, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {

            case R.id.como_usar:
                Intent intent = new Intent(Main2Activity.this, Comousar.class);
                startActivity(intent);

                return true;

            case R.id.config:
                Intent intent2 = new Intent(Main2Activity.this, Configuracion.class);
                startActivity(intent2);

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

}
