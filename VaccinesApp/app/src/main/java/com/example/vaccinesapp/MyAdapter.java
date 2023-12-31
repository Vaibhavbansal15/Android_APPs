package com.example.vaccinesapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    // 1- Data Source
    private VaccineModel[] listData;

    public ItemClickListener clickListener;

    public MyAdapter(VaccineModel[] listData) {
        this.listData = listData;
    }

    public void setClickListener(ItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    // 2- View Holder:
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public ImageView vaccineImg;
        public TextView vaccineName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.vaccineImg = itemView.findViewById(R.id.imageView);
            this.vaccineName = itemView.findViewById(R.id.textView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(clickListener != null){
                clickListener.onClick(itemView, getAdapterPosition());
            }
        }
    }

    // 3- Implementing Methods

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listItem = inflater.inflate(
                R.layout.recyclerview_item,
                parent,
                false
        );
        MyViewHolder viewHolder = new MyViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final VaccineModel myListData = listData[position];
        holder.vaccineName.setText(listData[position].getTitle());
        holder.vaccineImg.setImageResource(listData[position].getImage());
    }

    @Override
    public int getItemCount() {
        return listData.length;
    }
}
