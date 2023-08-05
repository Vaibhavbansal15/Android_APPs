package com.example.greetingsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.title);

        EditText userEditText = findViewById(R.id.edittext);

        Button myBtn = findViewById(R.id.btn);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputName = userEditText.getText().toString();
                Toast.makeText(MainActivity.this,
                        "Welcome "+inputName+" to our App",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}