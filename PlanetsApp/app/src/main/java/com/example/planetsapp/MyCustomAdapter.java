package com.example.planetsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Planet> {
    // Using Custom Layout  --> MyCustomAdapter
    // Using Custom Objects --> extends ArrayAdapter<Planet>
    private ArrayList<Planet> planetsArrayList;
    Context context;

    public MyCustomAdapter(ArrayList<Planet> planetsArrayList, Context context) {
        super(context, R.layout.item_list_layout, planetsArrayList);
        this.planetsArrayList = planetsArrayList;
        this.context = context;
    }

    // Holder Class
    private static class MyViewHolder{
        TextView planetName;
        TextView moonCount;
        ImageView planetImg;

    }

    // getView()

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // 1- Get the Planet object for the current position
        Planet planets = getItem(position);

        //2- Inflate layout
        MyViewHolder myViewHolder;
        final View result;
        if(convertView == null) {
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.item_list_layout,
                    parent,
                    false
            );

            // Finding Views
            myViewHolder.planetName = (TextView) convertView.findViewById(R.id.planet_name);
            myViewHolder.planetImg = (ImageView) convertView.findViewById(R.id.planet_img);
            myViewHolder.moonCount = (TextView) convertView.findViewById(R.id.moons);

            result = convertView;

            convertView.setTag(myViewHolder);
        }else {
            // the view is recycled
            myViewHolder = (MyViewHolder) convertView.getTag();
            result = convertView;

            // getting the data from the model class
            myViewHolder.planetName.setText(planets.getPlanetName());
            myViewHolder.moonCount.setText(planets.getMoonCount());
            myViewHolder.planetImg.setImageResource(planets.getPlanetImage());

        }
        return result;
    }
}
