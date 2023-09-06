package com.example.gamesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    //1-Data
    ArrayList<Games> gamesList;

    //2- Adapter View
    RecyclerView recycler_view;

    //3- Adapter
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_view = findViewById(R.id.recyclerView);

        gamesList = new ArrayList<>();
        gamesList.add(new Games(R.drawable.card1, "Horizon Chase"));
        gamesList.add(new Games(R.drawable.card2, "PUBG"));
        gamesList.add(new Games(R.drawable.card3, "Head Ball"));
        gamesList.add(new Games(R.drawable.card4, "Hooked on You"));
        gamesList.add(new Games(R.drawable.card5, "FIFA 2022"));
        gamesList.add(new Games(R.drawable.card6, "Fortnite"));

        adapter = new MyAdapter(this, gamesList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recycler_view.setLayoutManager(layoutManager);
        recycler_view.setAdapter(adapter);

    }
}