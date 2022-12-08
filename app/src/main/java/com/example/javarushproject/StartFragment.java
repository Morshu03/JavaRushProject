package com.example.javarushproject;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class StartFragment extends Fragment {

    Button plusBtn, minusBtn, quantityBtn;
    TextView quantityText;
    int defValue = 0;
    int plsMnsCount = 1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_start, container, false);
        quantityText = view.findViewById(R.id.quantity_text);
        minusBtn = view.findViewById(R.id.minus_btn);
        plusBtn = view.findViewById(R.id.plus_btn);
        quantityBtn = view.findViewById(R.id.quantity_button);

        plusBtn.setOnClickListener(plusView -> {
            defValue += plsMnsCount;
            quantityText.setText(String.valueOf(defValue));
        });
        minusBtn.setOnClickListener(minusView -> {
            defValue -= plsMnsCount;
            quantityText.setText(String.valueOf(defValue));
        });
        quantityBtn.setOnClickListener(quantityView -> {
            if (defValue > 0) {
                Bundle bundle = new Bundle();
                bundle.putInt("deep", defValue);
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FirstFragment firstFragment = new FirstFragment();
                firstFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.first_container, firstFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            } else {
                Toast.makeText(getActivity().getApplicationContext(), "dygf", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
//quantityBtn.setOnClickListener(quantityView -> {
//Bundle bundle = new Bundle();
//bundle.putInt("key", defValue);
//FirstFragment fragment = new FirstFragment();
//fragment.setArguments(bundle);
//get
//});
//}
//plusBtn.setOnClickListener(view -> {
//        defaultValue += count;
//        quantityText.setText(String.valueOf(defaultValue));
//    });
//        minusBtn.setOnClickListener(view -> {
//        defaultValue -= count;
//        quantityText.setText(String.valueOf(defaultValue));
//    });
//        shopBtn.setOnClickListener(view -> {
//        if (defaultValue > 0) {
//            Intent myIntent = new Intent(this, SecondActivity.class);
//            myIntent.putExtra(DEFAULT_VALUE_KEY, defaultValue);
//            this.startActivity(myIntent);
//        } else {
//            Toast.makeText(this, "dygf", Toast.LENGTH_SHORT).show();
//        }
//    });
//


