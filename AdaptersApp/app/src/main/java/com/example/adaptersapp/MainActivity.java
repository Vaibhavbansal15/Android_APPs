package com.example.adaptersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Adapter View: ListView
        listView = findViewById(R.id.listView);

        // Data source
        String[] countries = {"India","USA","Germany","France"};

        myCustomAdapter adapter = new myCustomAdapter(this, countries);

        // Adapter
        listView.setAdapter(adapter);
    }
}