package com.example.ricardo.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.ricardo.myapplication.mapas.arancibia;
import com.example.ricardo.myapplication.mapas.acosta;
import com.example.ricardo.myapplication.mapas.becerra;
import com.example.ricardo.myapplication.mapas.camus;
import com.example.ricardo.myapplication.mapas.castro;
import com.example.ricardo.myapplication.mapas.gajardo;
import com.example.ricardo.myapplication.mapas.garces;
import com.example.ricardo.myapplication.mapas.guajardo;
import com.example.ricardo.myapplication.mapas.hernandez;
import com.example.ricardo.myapplication.mapas.llanquin;
import com.example.ricardo.myapplication.mapas.lorca;
import com.example.ricardo.myapplication.mapas.medina;
import com.example.ricardo.myapplication.mapas.meza;
import com.example.ricardo.myapplication.mapas.mino;
import com.example.ricardo.myapplication.mapas.morgado;
import com.example.ricardo.myapplication.mapas.olivares;
import com.example.ricardo.myapplication.mapas.ortiz;
import com.example.ricardo.myapplication.mapas.perez;
import com.example.ricardo.myapplication.mapas.rodriguez;
import com.example.ricardo.myapplication.mapas.rojas;
import com.example.ricardo.myapplication.mapas.saavedra;
import com.example.ricardo.myapplication.mapas.saez;
import com.example.ricardo.myapplication.mapas.sanchesl;
import com.example.ricardo.myapplication.mapas.sanchesp;
import com.example.ricardo.myapplication.mapas.sandoval;
import com.example.ricardo.myapplication.mapas.sanmartin;
import com.example.ricardo.myapplication.mapas.soto;
import com.example.ricardo.myapplication.mapas.suazo;
import com.example.ricardo.myapplication.mapas.zavala;





public class Direcciones extends AppCompatActivity {
    Button arancibia;
    Button becerra;
    Button camus;
    Button castro;
    Button acosta;
    Button gajardo;
    Button garces;
    Button guajardo;
    Button hernandez;
    Button llanquin;
    Button lorca;
    Button medina;
    Button mino;
    Button meza;
    Button morgado;
    Button olivares;
    Button ortiz;
    Button perez;
    Button rodriguez;
    Button rojas;
    Button saavedra;
    Button saez;
    Button sanchesl;
    Button sanchesp;
    Button sandoval;
    Button sanmartin;
    Button soto;
    Button suazo;
    Button zavala;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direcciones);


        arancibia =(Button)findViewById(R.id.arancibia);
        becerra =(Button)findViewById(R.id.becerra);
        camus =(Button)findViewById(R.id.camus);
        castro =(Button)findViewById(R.id.castro);
        acosta =(Button)findViewById(R.id.acosta);
        gajardo =(Button)findViewById(R.id.gajardo);
        garces =(Button)findViewById(R.id.garces);
        guajardo =(Button)findViewById(R.id.guajardo);
        hernandez =(Button)findViewById(R.id.hernandez);
        llanquin =(Button)findViewById(R.id.llanquin);
        lorca =(Button)findViewById(R.id.lorca);
        medina =(Button)findViewById(R.id.medina);
        meza =(Button)findViewById(R.id.meza);
        mino =(Button)findViewById(R.id.mino);
        morgado =(Button)findViewById(R.id.morgado);
        olivares =(Button)findViewById(R.id.olivares);
        ortiz =(Button)findViewById(R.id.ortiz);
        perez =(Button)findViewById(R.id.perez);
        rodriguez =(Button)findViewById(R.id.rodriguez);
        rojas =(Button)findViewById(R.id.rojas);
        saavedra =(Button)findViewById(R.id.saavedra);
        saez =(Button)findViewById(R.id.saez);
        sandoval =(Button)findViewById(R.id.sandoval);
        sanchesl =(Button)findViewById(R.id.sanchesl);
        sanchesp =(Button)findViewById(R.id.sanchesp);
        sanmartin =(Button)findViewById(R.id.sanmartin);
        soto =(Button)findViewById(R.id.soto);
        suazo =(Button)findViewById(R.id.suazo);
        zavala =(Button)findViewById(R.id.zavala);


        arancibia.setOnClickListener(new View.OnClickListener() {

                                           @Override
                                           public void onClick(View v) {

                                               Intent arancibia = new Intent(Direcciones.this, arancibia.class );
                                               startActivity(arancibia);
                                           }
                                       }

        );


        acosta.setOnClickListener(new View.OnClickListener() {

                                         @Override
                                         public void onClick(View v) {

                                             Intent acosta = new Intent(Direcciones.this, acosta.class );
                                             startActivity(acosta);
                                         }
                                     }

        );


        becerra.setOnClickListener(new View.OnClickListener() {

                                         @Override
                                         public void onClick(View v) {

                                             Intent becerra = new Intent(Direcciones.this, becerra.class );
                                             startActivity(becerra);
                                         }
                                     }

        );


        camus.setOnClickListener(new View.OnClickListener() {

                                         @Override
                                         public void onClick(View v) {

                                             Intent camus = new Intent(Direcciones.this, camus.class );
                                             startActivity(camus);
                                         }
                                     }

        );


        castro.setOnClickListener(new View.OnClickListener() {

                                         @Override
                                         public void onClick(View v) {

                                             Intent castro = new Intent(Direcciones.this, castro.class );
                                             startActivity(castro);
                                         }
                                     }

        );


        gajardo.setOnClickListener(new View.OnClickListener() {

                                         @Override
                                         public void onClick(View v) {

                                             Intent gajardo = new Intent(Direcciones.this, gajardo.class );
                                             startActivity(gajardo);
                                         }
                                     }

        );


        garces.setOnClickListener(new View.OnClickListener() {

                                         @Override
                                         public void onClick(View v) {

                                             Intent garces = new Intent(Direcciones.this, garces.class );
                                             startActivity(garces);
                                         }
                                     }

        );


        guajardo.setOnClickListener(new View.OnClickListener() {

                                         @Override
                                         public void onClick(View v) {

                                             Intent guajardo = new Intent(Direcciones.this, guajardo.class );
                                             startActivity(guajardo);
                                         }
                                     }

        );


        hernandez.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

                                            Intent hernandez = new Intent(Direcciones.this, hernandez.class );
                                            startActivity(hernandez);
                                        }
                                    }

        );


        llanquin.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

                                            Intent llanquin = new Intent(Direcciones.this, llanquin.class );
                                            startActivity(llanquin);
                                        }
                                    }

        );


        lorca.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

                                            Intent lorca = new Intent(Direcciones.this, lorca.class );
                                            startActivity(lorca);
                                        }
                                    }

        );


        medina.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

                                            Intent medina = new Intent(Direcciones.this, medina.class );
                                            startActivity(medina);
                                        }
                                    }

        );


        meza.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

                                            Intent meza = new Intent(Direcciones.this, meza.class );
                                            startActivity(meza);
                                        }
                                    }

        );


        mino.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View v) {

                                        Intent mino = new Intent(Direcciones.this, mino.class );
                                        startActivity(mino);
                                    }
                                }

        );


        morgado.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

                                            Intent morgado = new Intent(Direcciones.this, morgado.class );
                                            startActivity(morgado);
                                        }
                                    }

        );


        olivares.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

                                            Intent olivares = new Intent(Direcciones.this, olivares.class );
                                            startActivity(olivares);
                                        }
                                    }

        );


        ortiz.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

                                            Intent ortiz = new Intent(Direcciones.this, ortiz.class );
                                            startActivity(ortiz);
                                        }
                                    }

        );


        perez.setOnClickListener(new View.OnClickListener() {

                                     @Override
                                     public void onClick(View v) {

                                         Intent perez = new Intent(Direcciones.this, perez.class );
                                         startActivity(perez);
                                     }
                                 }

        );


        rodriguez.setOnClickListener(new View.OnClickListener() {

                                     @Override
                                     public void onClick(View v) {

                                         Intent rodriguez = new Intent(Direcciones.this, rodriguez.class );
                                         startActivity(rodriguez);
                                     }
                                 }

        );


        rojas.setOnClickListener(new View.OnClickListener() {

                                     @Override
                                     public void onClick(View v) {

                                         Intent rojas = new Intent(Direcciones.this, rojas.class );
                                         startActivity(rojas);
                                     }
                                 }

        );


        saavedra.setOnClickListener(new View.OnClickListener() {

                                     @Override
                                     public void onClick(View v) {

                                         Intent saavedra = new Intent(Direcciones.this, saavedra.class );
                                         startActivity(saavedra);
                                     }
                                 }

        );


        saez.setOnClickListener(new View.OnClickListener() {

                                     @Override
                                     public void onClick(View v) {

                                         Intent saez = new Intent(Direcciones.this, saez.class );
                                         startActivity(saez);
                                     }
                                 }

        );


        sanchesl.setOnClickListener(new View.OnClickListener() {

                                     @Override
                                     public void onClick(View v) {

                                         Intent sanchesl = new Intent(Direcciones.this, sanchesl.class );
                                         startActivity(sanchesl);
                                     }
                                 }

        );


        sanchesp.setOnClickListener(new View.OnClickListener() {

                                     @Override
                                     public void onClick(View v) {

                                         Intent sanchesp = new Intent(Direcciones.this, sanchesp.class );
                                         startActivity(sanchesp);
                                     }
                                 }

        );


        sanmartin.setOnClickListener(new View.OnClickListener() {

                                     @Override
                                     public void onClick(View v) {

                                         Intent sanmartin = new Intent(Direcciones.this, sanmartin.class );
                                         startActivity(sanmartin);
                                     }
                                 }

        );


        soto.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

                                            Intent soto = new Intent(Direcciones.this, soto.class );
                                            startActivity(soto);
                                        }
                                    }

        );


        suazo.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

                                            Intent suazo = new Intent(Direcciones.this, suazo.class );
                                            startActivity(suazo);
                                        }
                                    }

        );


        zavala.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

                                            Intent zavala = new Intent(Direcciones.this, zavala.class );
                                            startActivity(zavala);
                                        }
                                    }

        );


        sandoval.setOnClickListener(new View.OnClickListener() {

                                      @Override
                                      public void onClick(View v) {

                                          Intent sandoval = new Intent(Direcciones.this, sandoval.class );
                                          startActivity(sandoval);
                                      }
                                  }

        );





    }
}
