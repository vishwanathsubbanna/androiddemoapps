package com.example.tourguide;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class EventHandlerForSSPlaces implements AdapterView.OnItemSelectedListener
{
    private AppCompatActivity myApp;

    public  EventHandlerForSSPlaces(AppCompatActivity appInstance)
    {
        myApp=appInstance;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {
        String selectedSSPlaces;
        ArrayAdapter adp=null;
        selectedSSPlaces=adapterView.getSelectedItem().toString();

        WebView wView=myApp.findViewById(R.id.webview);
        wView.setWebViewClient(new WebViewClient());
        wView.loadUrl("https://www.google.com/search?q="+selectedSSPlaces);
    }

    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
