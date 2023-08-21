package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // 1- AdapterView: GridView
    GridView gridView;

    // 2- Data Source: ArrayList<Shape>
    ArrayList<Shape> shapeArrayList;

    // 3- Adapter: MyCustomAdapter
    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        shapeArrayList = new ArrayList<>();

        Shape s1 = new Shape(R.drawable.sphere, "Sphere");
        Shape s2 = new Shape(R.drawable.cylinder, "Cylinder");
        Shape s3 = new Shape(R.drawable.cube, "Cube");
        Shape s4 = new Shape(R.drawable.triangular, "Prism");

        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);

        adapter = new MyCustomAdapter(shapeArrayList, getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                   Intent i1 = new Intent(getApplicationContext(), Sphere.class);
                   Intent i2 = new Intent(getApplicationContext(), Cylinder.class);
                   Intent i3 = new Intent(getApplicationContext(), Cube.class);
                   Intent i4 = new Intent(getApplicationContext(), Prism.class);
                   if(id == 0)
                       startActivity(i1);
                   else if(id == 1)
                       startActivity(i2);
                   else if(id == 2)
                       startActivity(i3);
                   else
                       startActivity(i4);
            }
        });
    }
}