package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cube extends AppCompatActivity {

    TextView title, cube_result;
    EditText cube_side;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        title = findViewById(R.id.text_cube);
        cube_side = findViewById(R.id.editText_Cube);
        cube_result = findViewById(R.id.cube_volume);
        btn2 = findViewById(R.id.Btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String side = cube_side.getText().toString();
                int s = Integer.parseInt(side);

                double V = s*s*s;
                cube_result.setText("V= "+V+" m^3");
            }
        });
    }
}