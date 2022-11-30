package com.example.javarushproject;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int defaultValue = 0;
    int count = 1;
    Button plusBtn;
    Button minusBtn;
    ImageButton shopBtn;
    TextView quantityText;


    public static final String DEFAULT_VALUE_KEY = "default_value_key";

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plusBtn = findViewById(R.id.btn_plus);
        minusBtn = findViewById(R.id.btn_minus);
        shopBtn = findViewById(R.id.shop_btn);
        quantityText = findViewById(R.id.quantity_text_view);

        plusBtn.setOnClickListener(view -> {
            defaultValue += count;
            quantityText.setText(String.valueOf(defaultValue));
        });

        minusBtn.setOnClickListener(view -> {
            defaultValue -= count;
            quantityText.setText(String.valueOf(defaultValue));
        });

        shopBtn.setOnClickListener(view -> {
            if (defaultValue > 0) {
                Intent myIntent = new Intent(this, SecondActivity.class);
                myIntent.putExtra(DEFAULT_VALUE_KEY, defaultValue);
                this.startActivity(myIntent);
            } else {
                Toast.makeText(this, "dygf", Toast.LENGTH_SHORT).show();
            }
        });
    }

}