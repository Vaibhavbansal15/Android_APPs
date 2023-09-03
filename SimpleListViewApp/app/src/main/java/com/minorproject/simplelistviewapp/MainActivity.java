package com.minorproject.simplelistviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1- AdapterView : ListView
        listView = findViewById(R.id.listview);

        // 2- Data Source
        String[] worldCup23 = {
                "India",
                "Pakistan",
                "England",
                "Australia",
                "West Indies"
        };

        // 3- Adapter
        ArrayAdapter adapter = new ArrayAdapter(
                this,
                R.layout.my_item_layout,
                R.id.textView,
                worldCup23
        );
        listView.setAdapter(adapter);
    }
}