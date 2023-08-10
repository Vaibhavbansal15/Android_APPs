package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button luckBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.welcome_text);
        editText = findViewById(R.id.inout_name);
        luckBtn = findViewById(R.id.luck_btn);

        luckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                Toast.makeText(MainActivity.this,
                        "Good Luck!"+name,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}