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
    public static final String KEY_ITEM_AMOUNT = "keyItemAmount";
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = view.findViewById(R.id.text);
        requireActivity().setTitle("Cart");
        Bundle bundle = getArguments();
        int itemAmount = 0;
        if (bundle != null) {
            itemAmount = bundle.getInt(KEY_ITEM_AMOUNT);
        }
        textView.setText(String.valueOf(itemAmount));
    }

}