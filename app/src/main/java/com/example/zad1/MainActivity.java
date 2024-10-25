package com.example.zad1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView myTextView;
    private float textSize = 18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = findViewById(R.id.myTextView);
        Button buttonChangeColor = findViewById(R.id.buttonChangeColor);
        Button buttonChangeText = findViewById(R.id.buttonChangeText);
        Button buttonHideTextView = findViewById(R.id.buttonHideTextView);
        Button buttonOpenNewActivity = findViewById(R.id.buttonOpenNewActivity);
        Button buttonIncreaseTextSize = findViewById(R.id.buttonIncreaseTextSize);

        buttonChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setTextColor(Color.RED);
            }
        });

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText("Nowy tekst!");
            }
        });

        buttonHideTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setVisibility(View.GONE);
            }
        });

        buttonOpenNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(intent);
            }
        });

        buttonIncreaseTextSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textSize += 2;
                myTextView.setTextSize(textSize);
            }
        });
    }
}
