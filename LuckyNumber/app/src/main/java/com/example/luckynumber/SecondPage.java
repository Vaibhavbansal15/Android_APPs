package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.UserHandle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
import java.util.jar.Attributes;

public class SecondPage extends AppCompatActivity {

    TextView welcomeTxt, LuckyNumberTxt;
    Button shareBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        welcomeTxt = findViewById(R.id.textView1);
        LuckyNumberTxt = findViewById(R.id.textView2);
        shareBtn = findViewById(R.id.share_btn);

        Intent i = getIntent();
        String userName = i.getStringExtra("Name");

        // Generating Random Number
        int random_number = generateRandomNumber();
        LuckyNumberTxt.setText("" + random_number);

        // sharing the result

        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareData(userName, random_number);
            }
        });
    }
        public void shareData(String username, int randNum){
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("Text/Plain");

            // Additional information
            i.putExtra(Intent.EXTRA_SUBJECT, username + " got Lucky Today");
            i.putExtra(Intent.EXTRA_TEXT, "His Lucky Number is: "+randNum);
            startActivity(i);
        }

    public int generateRandomNumber(){
        Random rand = new Random();
        int upper_limit = 1000;
        int randomNumberGenerated = rand.nextInt(upper_limit);
        return randomNumberGenerated;
    }
}