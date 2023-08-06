package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result_text;
    EditText input_text;
    Button myBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result_text = findViewById(R.id.result);
        input_text = findViewById(R.id.userInput);
        myBtn = findViewById(R.id.Btn);

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_input = input_text.getText().toString();
                double kilos = Double.parseDouble(user_input);

                double pounds = inPounds(kilos);
                result_text.setText(""+pounds);
            }
        });
    }

    public double inPounds(double kilos){
        return kilos*2.20462;
    }
}