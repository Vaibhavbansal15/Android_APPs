package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView welcomeText = findViewById(R.id.textView);
        Button black = findViewById(R.id.blackBtn);
        Button green = findViewById(R.id.greenBtn);
        Button purple = findViewById(R.id.purpleBtn);
        Button red = findViewById(R.id.redBtn);
        Button yellow = findViewById(R.id.yellowBtn);
    }
}