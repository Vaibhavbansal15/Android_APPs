package com.example.adaptersapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class myCustomAdapter extends BaseAdapter {
private Context context;
private String[] items;

    public myCustomAdapter(Context context, String items[]){
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;   // returns the number of items in your data source
    }

    @Override
    public Object getItem(int position) {
        return items[position];    // Returns the data item at a specific position
    }

    @Override
    public long getItemId(int position) {
        return position;   // Returns a unique identifier for the item at a given position
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.my_list_item, parent, false);
            holder = new ViewHolder();
            holder.textView = convertView.findViewById(R.id.text1);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        holder.textView.setText(items[position]);
        return convertView;    // Displays the data at a position in the data set
    }

    static class ViewHolder{
        // Holds references to the views within an item layout
        TextView textView;

    }
}