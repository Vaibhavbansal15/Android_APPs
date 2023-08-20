package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Sphere extends AppCompatActivity {

    EditText sphere_radius;
    TextView title, sphere_result;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);
        sphere_radius = findViewById(R.id.editText_sphere);
        title = findViewById(R.id.text_Sphere);
        sphere_result = findViewById(R.id.sphere_volume);
        btn1 = findViewById(R.id.Btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = sphere_radius.getText().toString();
                int r = Integer.parseInt(radius);

                double Volume = (4/3) * 3.14159 * r*r*r;
                sphere_result.setText("V = "+Volume+" m^3");
            }
        });
    }
}