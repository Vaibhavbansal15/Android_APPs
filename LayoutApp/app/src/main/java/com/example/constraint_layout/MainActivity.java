package com.example.constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing UI Elements and Variables here
        Toast.makeText(this,
                "onCreate() is called ",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        // Start Animations and other UI-related tasks
        Toast.makeText(this,
                "onStart() is called ",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Start Sensors and Location Update etc....
        Toast.makeText(this,
                "onResume() is Called ",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        // Release resources, pause ongoing Operations, etc...
        Toast.makeText(this,
                "onPause() is called",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Release resources and save data, etc...
        Toast.makeText(this,
                "onStop() is called",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        //Perform any necessary restart tasks
        Toast.makeText(this,
                "onRestart() is called",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // clean up resource and finalize tasks, etc...
        Toast.makeText(this,
                "onDestroy() is called",
                Toast.LENGTH_SHORT).show();
    }
}