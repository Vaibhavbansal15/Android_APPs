package com.example.widgetsapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TimePicker timepicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timepicker = findViewById(R.id.timepicker);
        timepicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                // Handle Time change
                Toast.makeText(MainActivity.this,
                        "Hour: "+hourOfDay + " minute: "+minute,
                        Toast.LENGTH_LONG).show();
            }
        });

        DatePicker datePicker = findViewById(R.id.datePicker);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Day = "Day "+datePicker.getDayOfMonth();
                String Month = "Month "+(datePicker.getMonth()+1);
                String Year = "Year "+datePicker.getYear();

                Toast.makeText(MainActivity.this,
                        Day+" "+Month+" "+Year,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}