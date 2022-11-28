package com.example.javarushproject;

import static com.example.javarushproject.MainActivity.DEFAULT_VALUE_KEY;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView tittle;
    int defaultValue = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        defaultValue = this.getIntent().getIntExtra(DEFAULT_VALUE_KEY, 0);
        tittle = findViewById(R.id.text);
        tittle.setText(String.valueOf(defaultValue));
    }
}
