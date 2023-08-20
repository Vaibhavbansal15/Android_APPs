package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prism extends AppCompatActivity {

    TextView title, prism_result;
    EditText prism_base, prism_height;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        title = findViewById(R.id.text_Prism);
        prism_base = findViewById(R.id.editText_prism);
        prism_height = findViewById(R.id.editText_prism2);
        btn4 = findViewById(R.id.Btn4);
        prism_result = findViewById(R.id.prism_volume);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String base = prism_base.getText().toString();
                int b = Integer.parseInt(base);
                String height = prism_height.getText().toString();
                int h = Integer.parseInt(height);

                double V = b*h;
                prism_result.setText("V= "+V+" m^3");
            }
        });

    }
}