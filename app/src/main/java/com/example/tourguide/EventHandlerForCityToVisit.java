package com.example.tourguide;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class EventHandlerForCityToVisit implements AdapterView.OnItemSelectedListener
{
    private AppCompatActivity myApp;

    public EventHandlerForCityToVisit(AppCompatActivity appInstance)
    {
        myApp=appInstance;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {
        String selectedCityToVisit;
        ArrayAdapter adp=null;
        selectedCityToVisit=adapterView.getSelectedItem().toString();

        if(selectedCityToVisit.equals("Mysore"))
        {
             adp = ArrayAdapter.createFromResource(myApp, R.array.mysplaces, R.layout.support_simple_spinner_dropdown_item);
        }
        else if(selectedCityToVisit.equals("Bangalore"))
        {
             adp = ArrayAdapter.createFromResource(myApp, R.array.blrplaces, R.layout.support_simple_spinner_dropdown_item);
        }
        else if(selectedCityToVisit.equals("Chikkamagalur"))
        {
             adp = ArrayAdapter.createFromResource(myApp, R.array.cmgplaces, R.layout.support_simple_spinner_dropdown_item);
        }
        else if(selectedCityToVisit.equals("K R Pet"))
        {
             adp = ArrayAdapter.createFromResource(myApp, R.array.krpplaces, R.layout.support_simple_spinner_dropdown_item);
        }
        else if(selectedCityToVisit.equals("Madikeri"))
        {
             adp = ArrayAdapter.createFromResource(myApp, R.array.madplaces, R.layout.support_simple_spinner_dropdown_item);
        }
        Spinner ssPlaces=myApp.findViewById(R.id.ssplaces);
        ssPlaces.setAdapter(adp);
    }

    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
