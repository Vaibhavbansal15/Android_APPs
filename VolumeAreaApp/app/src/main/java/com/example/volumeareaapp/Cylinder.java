package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cylinder extends AppCompatActivity {

    EditText cylinder_radius;
    TextView title, cylinder_result, cylinder_height;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        title = findViewById(R.id.text_cylinder);
        cylinder_radius = findViewById(R.id.editText_cylinder);
        cylinder_height = findViewById(R.id.editText_cylinder2);
        btn3 = findViewById(R.id.Btn3);
        cylinder_result = findViewById(R.id.cylinder_volume);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = cylinder_radius.getText().toString();
                String height = cylinder_height.getText().toString();
                int r = Integer.parseInt(radius);
                int h = Integer.parseInt(height);

                double V = 3.14159*r*r*h;
                cylinder_result.setText("V= "+V+" m^3");
            }
        });
    }
}