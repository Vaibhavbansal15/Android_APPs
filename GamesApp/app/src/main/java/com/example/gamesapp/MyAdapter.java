package com.example.gamesapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    //1- Data
    private Context context;
    private ArrayList<Games> gamesList;

    //2- Constructor
    public MyAdapter(Context context, ArrayList<Games> gamesList) {
        this.context = context;
        this.gamesList = gamesList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Games model = gamesList.get(position);
        holder.gameTxt.setText(model.getGameTxt());
        holder.gamePic.setImageResource(model.getGameImg());
    }

    @Override
    public int getItemCount() {
        return gamesList.size();
    }

    //3- ViewHolder class
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView gamePic;
        private TextView gameTxt;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            gamePic = itemView.findViewById(R.id.gameImage);
            gameTxt = itemView.findViewById(R.id.gameTitle);
        }
    }
}
