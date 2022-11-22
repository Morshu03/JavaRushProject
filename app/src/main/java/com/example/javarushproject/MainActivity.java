package com.example.javarushproject;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //TODO: Создать переменную Int = 0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submitBtn = findViewById(R.id.btn_order);
        submitBtn.setOnClickListener(view -> {
            submitOrder();
        });
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder() {
        // TODO: Добавлять +2 к переменной
        //
        //
        display(1);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText(number);
    }
}
