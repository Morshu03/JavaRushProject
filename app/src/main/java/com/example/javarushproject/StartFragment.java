package com.example.javarushproject;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.javarushproject.model.Dog;

public class StartFragment extends Fragment {

    Button plusBtn, minusBtn, quantityBtn;
    TextView quantityText;
    int itemAmount = 0;
    int plsMnsCount = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_start, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        quantityText = view.findViewById(R.id.quantity_text);
        minusBtn = view.findViewById(R.id.minus_btn);
        plusBtn = view.findViewById(R.id.plus_btn);
        quantityBtn = view.findViewById(R.id.quantity_button);
        requireActivity().setTitle(R.string.app_name);
        quantityText.setText(String.valueOf(itemAmount));
        Dog sobaka = new Dog(32, 239);
        Log.d("TESTEST", "sobaka = " + sobaka.toString());
        Dog sobaka2 = new Dog(22, 1123);
        Log.d("TESTEST", "sobaka2 = " + sobaka2.toString());
        Log.d("TESTEST", "equals = " +  sobaka.equals(sobaka2));
        plusBtn.setOnClickListener(plusView -> {
            itemAmount += plsMnsCount;
            quantityText.setText(String.valueOf(itemAmount));
        });
        minusBtn.setOnClickListener(minusView -> {
            itemAmount -= plsMnsCount;
            quantityText.setText(String.valueOf(itemAmount));
        });
        quantityBtn.setOnClickListener(quantityView -> {
            if (itemAmount > 0) {
                Bundle bundle = new Bundle();
                bundle.putInt(FirstFragment.KEY_ITEM_AMOUNT, itemAmount);
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
    }
}
//quantityBtn.setOnClickListener(quantityView -> {
//Bundle bundle = new Bundle();
//bundle.putInt("key", itemAmount);
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


