package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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

        black.setOnClickListener(this);
        green.setOnClickListener(this);
        purple.setOnClickListener(this);
        red.setOnClickListener(this);
        yellow.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // Find the Button id and play the correct sound
        int clickedButtonId = v.getId();
        if(clickedButtonId == R.id.blackBtn){
            playSounds(R.raw.black);
        }
        else if(clickedButtonId == R.id.greenBtn){
            playSounds(R.raw.green);
        }
        else if(clickedButtonId == R.id.purpleBtn){
            playSounds(R.raw.purple);
        }
        else if(clickedButtonId == R.id.redBtn){
            playSounds(R.raw.red);
        }
        else if(clickedButtonId == R.id.yellowBtn){
            playSounds(R.raw.yellow);
        }
    }

    public void playSounds(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, id);
        mediaPlayer.start();
    }
}