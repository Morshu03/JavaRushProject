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

public class StartFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_start, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button catBtn, dogBtn;

        dogBtn = view.findViewById(R.id.dog_btn);
        catBtn = view.findViewById(R.id.cat_btn);

        dogBtn.setOnClickListener(dogView -> replaceFragment());
        catBtn.setOnClickListener(catView -> replaceFragment());

    }
    private void replaceFragment() {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        //Создать новый бандл
        //положить в бандл по ключу значение (цифорка)
        //Подкинуть бандл в качестве аргумента в метод replace
        //android create bundle
        //android pass string/data/argument to fragment
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, FirstFragment.class, new Bundle(), "tag");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


}