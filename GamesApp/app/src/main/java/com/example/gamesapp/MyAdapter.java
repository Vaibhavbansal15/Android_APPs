package com.example.gamesapp;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<Games>{

    //1- Data
    private Context context;
    private ArrayList<Games> gamesList;

    //2- Constructor
    public MyAdapter(Context context, ArrayList<Games> gamesList) {
        this.context = context;
        this.gamesList = gamesList;
    }
}
