package com.example.javarushproject;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int defaultValue = 0;
    int count = 1;
    Button plusBtn;
    Button minusBtn;
    TextView quantityText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plusBtn = findViewById(R.id.btn_plus);
        minusBtn = findViewById(R.id.btn_minus);
        quantityText = findViewById(R.id.quantity_text_view);
        plusBtn.setOnClickListener(view -> {
            defaultValue += count;
            quantityText.setText("" + defaultValue);
        });
        minusBtn.setOnClickListener(view -> {
            defaultValue -= count;
            quantityText.setText("" + defaultValue);
        });
    }
}