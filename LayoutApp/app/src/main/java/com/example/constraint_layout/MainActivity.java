package com.example.constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myBtn = findViewById(R.id.btn);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSecondActivity();
            }
        });


        Button btn2 = findViewById(R.id.OpenBrowser);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWebPage();
            }
        });


        // Initializing UI Elements and Variables here
        Toast.makeText(this,
                "onCreate() is called ",
                Toast.LENGTH_SHORT).show();
    }

    public void goToSecondActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void openWebPage(){
        Uri webpage = Uri.parse("https://www.google.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
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