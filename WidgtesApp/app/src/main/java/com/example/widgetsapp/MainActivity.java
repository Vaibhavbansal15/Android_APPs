package com.example.widgetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textview = findViewById(R.id.SampleTextView);

        EditText myEditText = findViewById(R.id.editText);


        Button myBTn = findViewById(R.id.myBtn);
        myBTn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This code will be executed when the button is clicked
                String inputText = myEditText.getText().toString();
                Toast.makeText(MainActivity.this,
                        "Hello "+inputText,
                        Toast.LENGTH_SHORT).show();
            }
        });

        ImageView myImageView = findViewById(R.id.SampleImg);
        myImageView.setImageResource(R.drawable.welcomeimg);
    }
}