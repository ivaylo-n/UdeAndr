package app.koki.com.realestateapp;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Locations extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locations);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
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
        mMap = googleMap;

        LatLng office1 = new LatLng(37.745334, -122.489794);
        mMap.addMarker(new MarkerOptions().position(office1).title("Office 1"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(office1));

        LatLng office2 = new LatLng(37.781124, -122.451396);
        mMap.addMarker(new MarkerOptions().position(office2).title("Office 2"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(office2));

        LatLng office3 = new LatLng(37.708719, -122.446588);
        mMap.addMarker(new MarkerOptions().position(office3).title("Office 3"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(office3));

        LatLng office4 = new LatLng(37.692437, -122.492153);
        mMap.addMarker(new MarkerOptions().position(office4).title("Office 4"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(office4));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(office3,12.0f));
    }
}
