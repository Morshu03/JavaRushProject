package com.example.javarushproject;


import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int defaultValue = 0;
    int count = 2;
    Button submitBtn;
    TextView quantityText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitBtn = findViewById(R.id.btn_order);
        quantityText = findViewById(R.id.quantity_text_view);
        Quantity();
    }
    void Quantity () {
        submitBtn.setOnClickListener(view -> {
            defaultValue += count;
            quantityText.setText("" + defaultValue);
        });
    }
}