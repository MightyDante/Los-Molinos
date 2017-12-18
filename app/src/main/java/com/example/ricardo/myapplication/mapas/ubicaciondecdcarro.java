package com.example.ricardo.myapplication.mapas;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;

import com.example.ricardo.myapplication.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static com.example.ricardo.myapplication.R.id.map;

public class ubicaciondecdcarro extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mmMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapscarros);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mmMap = googleMap;

        // Familia y Coordenadas

        LatLng carro1 = new LatLng(-33.3586082, -70.7420743);
        LatLng carro2 = new LatLng(-33.3533185, -70.747218);
        LatLng carro3 = new LatLng(-33.3485885, -70.7467886);
        LatLng carro4 = new LatLng(-33.351703, -70.739361);
        LatLng centro = new LatLng(-33.352860, -70.743699);



        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to c void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mmMap.setMyLocationEnabled(true);
        mmMap.moveCamera(CameraUpdateFactory.newLatLngZoom(centro, 15));
        mmMap.isMyLocationEnabled();

        mmMap.addMarker(new MarkerOptions()
                .position(centro)
                .visible(false));

        mmMap.addMarker(new MarkerOptions()
                .position(carro1)
                .title("Carro 1")
                .snippet("Familia Soto - Colombia 0260")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.puntocasacarito)));

        mmMap.addMarker(new MarkerOptions()
                .position(carro2)
                .title("Carro 2")
                .snippet("Familia Meza - Everest 0302")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.puntocasacarito)));

        mmMap.addMarker(new MarkerOptions()
                .position(carro3)
                .title("Carro 3")
                .snippet("Familia Suazo - Yawar 1017")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.puntocasacarito)));

        mmMap.addMarker(new MarkerOptions()
                .position(carro4)
                .title("Carro 4")
                .snippet("Familia Pérez - Santa Luisa 379")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.puntocasacarito)));

    }
}
