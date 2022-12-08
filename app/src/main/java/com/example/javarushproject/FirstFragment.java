package com.example.javarushproject;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FirstFragment extends Fragment {
    TextView textView;

    // достать цифру из бандла
    // android how to get value from bundle //fragment
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        textView = view.findViewById(R.id.text);


        Bundle bundle = getArguments();
        int depDep = bundle.getInt("deep");
        textView.setText(String.valueOf(depDep));
        return view;
    }

}