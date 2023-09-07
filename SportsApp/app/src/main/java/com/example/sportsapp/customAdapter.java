package com.example.sportsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class customAdapter extends RecyclerView.Adapter<customAdapter.SportsViewHolder> {

    private Context context;
    private final List<Sport> sportList;
    public ItemClickListener clickListener;

    public void setClickListener(ItemClickListener listener){
        this.clickListener = listener;
    }


    public customAdapter(Context context, List<Sport> sportList) {
        this.sportList = sportList;
        this.context = context;
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

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "You Choose: "+sportList.get(position).getSportName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public class SportsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textView;
        ImageView imageView;

        public SportsViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageViewCard);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(clickListener != null){
                clickListener.onClick(v, getAdapterPosition());
            }        }
    }
}
