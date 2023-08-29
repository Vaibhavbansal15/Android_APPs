package com.example.sportsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class customAdapter extends RecyclerView.Adapter<customAdapter.SportsViewHolder> {

    private List<Sport> sportList;

    public customAdapter(List<Sport> sportList) {
        this.sportList = sportList;
    }

    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_layout , parent , false);
        return new SportsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {
        Sport sport = sportList.get(position);
        holder.textView.setText(sport.getSportName());
        holder.imageView.setImageResource(sport.getSportImg());
    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public static class SportsViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;

        public SportsViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageViewCard);
        }
    }
}
