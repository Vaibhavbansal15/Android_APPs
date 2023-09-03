package com.example.worldcupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //1- Adapter View
    ListView listView;
    ArrayList<CountryModel> dataSet;

    private static CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        dataSet = new ArrayList<>();
        dataSet.add(new CountryModel(R.drawable.germany, "Germany","4"));
        dataSet.add(new CountryModel(R.drawable.brazil,"Brazil", "0"));
        dataSet.add(new CountryModel(R.drawable.france, "France", "2"));
        dataSet.add(new CountryModel(R.drawable.spain, "Spain", "1"));
        dataSet.add(new CountryModel(R.drawable.unitedkingdom, "England", "1"));
        dataSet.add(new CountryModel(R.drawable.unitedstates, "United States", "0"));
        dataSet.add(new CountryModel(R.drawable.saudiarabia, "Saudi Arabia", "0"));

        adapter = new CustomAdapter(dataSet, getApplicationContext());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,
                        "Country "+adapter.getItem(position).getCountry_name() +"\n"+
                        "World Cup wins: "+adapter.getItem(position).getCup_win_count(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}