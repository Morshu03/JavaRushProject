package com.example.javarushproject;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    int defaultValue = 0;
    int count = 1;
    Button plusBtn;
    Button minusBtn;
    ImageButton imageButton;
    TextView quantityText;
    Toolbar myToolbar;


    public static final String DEFAULT_VALUE_KEY = "default_value_key";

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.item1){
            Toast.makeText(this,getString(R.string.item1), Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plusBtn = findViewById(R.id.btn_plus);
        minusBtn = findViewById(R.id.btn_minus);
        quantityText = findViewById(R.id.quantity_text);
        myToolbar = findViewById(R.id.toolbar);
        imageButton = findViewById(R.id.image_button);
        setSupportActionBar(myToolbar);

        plusBtn.setOnClickListener(view -> {
            defaultValue += count;
            quantityText.setText(String.valueOf(defaultValue));
        });

        minusBtn.setOnClickListener(view -> {
            defaultValue -= count;
            quantityText.setText(String.valueOf(defaultValue));
        });

        imageButton.setOnClickListener(view -> {
            if (defaultValue > 0) {
                Intent myIntent = new Intent(this, SecondActivity.class);
                myIntent.putExtra(DEFAULT_VALUE_KEY, defaultValue);
                this.startActivity(myIntent);
            } else {
                Toast.makeText(this, "ошибка", Toast.LENGTH_SHORT).show();
            }
        });
    }

}