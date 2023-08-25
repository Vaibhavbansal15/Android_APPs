package com.example.vaccinesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    RecyclerView recyclerView;
    VaccineModel[] myListData;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        myListData = new VaccineModel[]{
                new VaccineModel(R.drawable.vaccine1, "Hepatitis B Vaccine"),
                new VaccineModel(R.drawable.vaccine4, "Tetanus Vaccine"),
                new VaccineModel(R.drawable.vaccine5, "Pneumococcal Vaccine"),
                new VaccineModel(R.drawable.vaccine6, "Rotavirus Vaccine"),
                new VaccineModel(R.drawable.vaccine7, "Measles Vaccine"),
                new VaccineModel(R.drawable.vaccine8, "Cholera Vaccine"),
                new VaccineModel(R.drawable.vaccine9, "Covid-19 Vaccine"),
        };

        adapter = new MyAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        adapter.setClickListener(this);

    }

    @Override
    public void onClick(View view, int pos) {
        Toast.makeText(this, "Vaccine Name: "+myListData[pos].getTitle(), Toast.LENGTH_SHORT).show();
    }
}