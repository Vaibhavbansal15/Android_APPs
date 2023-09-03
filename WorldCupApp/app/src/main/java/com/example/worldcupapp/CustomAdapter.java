package com.example.worldcupapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<CountryModel> {

    private ArrayList<CountryModel> countriesData;
    Context context;

    public CustomAdapter(ArrayList<CountryModel> data, Context context) {
        super(context, R.layout.custom_item_layout, data);
        this.countriesData = data;
        this.context = context;
    }

    private static class ViewHolder {
        TextView txtCountry, txtCupWins;
        ImageView flagImg;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Get the data item for this position
        CountryModel dataModel = getItem(position);

        ViewHolder viewHolder;
        final View result;

        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.custom_item_layout, parent, false);

            viewHolder.txtCountry = (TextView) convertView.findViewById(R.id.countryName);
            viewHolder.txtCupWins = (TextView) convertView.findViewById(R.id.winCount);
            viewHolder.flagImg = (ImageView) convertView.findViewById(R.id.countryFlag);

            result = convertView;
            convertView.setTag(viewHolder);
        }

        else{
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        // get the data from the model class
        viewHolder.txtCountry.setText(dataModel.getCountry_name());
        viewHolder.txtCupWins.setText(dataModel.getCup_win_count());
        viewHolder.flagImg.setImageResource(dataModel.getFlag_img());

        return convertView;
    }
}
