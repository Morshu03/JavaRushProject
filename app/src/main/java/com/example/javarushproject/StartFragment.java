package com.example.javarushproject;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.javarushproject.model.Animal;
import com.example.javarushproject.model.Cat;
import com.example.javarushproject.model.Dog;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

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

        Dog first_sobaka = new Dog(30, 65, "Аляска");
        Dog second_sobaka = new Dog(25, 60, "Каспер");
        Dog third_sobaka = new Dog(12, 35, "Бульдог");
        Dog fourth_sobaka = new Dog(13, 36, "Значение_знаешь?");
        Dog fifth_sobaka = new Dog(14, 37, "Буль_ДОГ");

        Cat pervaya_koshka = new Cat(15, 15, "Домашнич", 8);
        Cat vtoraya_koshka = new Cat(10, 12, "Помойнич", 1);
        Cat tretiya_koshka = new Cat(2, 3, "Новорождёныч", 8);
        Cat chetvertaya_koska = new Cat(15, 1, "Приведеныч", 0);
        Cat pyataya_koshka = new Cat(12, 14, "Томыч", 3);

        Animal[] animals = {first_sobaka, second_sobaka, third_sobaka, fourth_sobaka, fifth_sobaka, pervaya_koshka, vtoraya_koshka, tretiya_koshka, chetvertaya_koska, pyataya_koshka};
        LinkedList<Animal> animals1 = new LinkedList<Animal>();
        for (int i = 0; i < animals.length; i++) {
            Log.d("TEST", "zhivotnie =" + animals[i].toString());
        }
        HashMap<String, Animal> animalHashMap = new HashMap<>();
        animalHashMap.put("Аляск а", first_sobaka);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Log.d("TEST", "mapResult " + animalHashMap.get("Аляска"));
        }


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
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FirstFragment firstFragment = new FirstFragment();
                firstFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.first_container, firstFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            } else {
                Toast.makeText(requireActivity().getApplicationContext(), "dygf", Toast.LENGTH_SHORT).show();
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


