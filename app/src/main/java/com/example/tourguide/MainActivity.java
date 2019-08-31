package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner cityToVisit=findViewById(R.id.citytovisit);
        cityToVisit.setOnItemSelectedListener(new EventHandlerForCityToVisit(this));

        Spinner citySSPlaces=findViewById(R.id.ssplaces);
        citySSPlaces.setOnItemSelectedListener(new EventHandlerForSSPlaces(this));

    }


}
