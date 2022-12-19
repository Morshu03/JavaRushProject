package com.example.javarushproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


class FirstFragment : Fragment() {
    private lateinit var textView: TextView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.text)
        requireActivity().title = "Cart"
        val bundle = arguments
        var itemAmount = 0
        if (bundle != null) {
            itemAmount = bundle.getInt(KEY_ITEM_AMOUNT)
        }
        textView.text = itemAmount.toString()
    }

    companion object {
        const val KEY_ITEM_AMOUNT = "keyItemAmount"
    }
}