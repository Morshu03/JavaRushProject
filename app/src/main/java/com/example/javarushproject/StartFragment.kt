package com.example.javarushproject
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.javarushproject.model.Animal
import com.example.javarushproject.model.Cat
import com.example.javarushproject.model.Dog


class StartFragment : Fragment() {
    private lateinit var quantityText: TextView
    private lateinit var plusBtn: Button
    private lateinit var minusBtn: Button
    private lateinit var quantityBtn: Button
    private var itemAmount = 0
    private var plsMnsCount = 1
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        quantityText = view.findViewById(R.id.quantity_text)
        minusBtn = view.findViewById(R.id.minus_btn)
        plusBtn = view.findViewById(R.id.plus_btn)
        quantityBtn = view.findViewById(R.id.quantity_button)
        requireActivity().setTitle(R.string.app_name)
        quantityText.text = itemAmount.toString()

        plusBtn.setOnClickListener {
            itemAmount += plsMnsCount
            quantityText.text = itemAmount.toString()
        }
        minusBtn.setOnClickListener {
            itemAmount -= plsMnsCount
            quantityText.text = itemAmount.toString()
        }
        quantityBtn.setOnClickListener {
            if (itemAmount > 0) {
                val bundle = Bundle()
                bundle.putInt(FirstFragment.KEY_ITEM_AMOUNT, itemAmount)
                val fragmentManager =
                        requireActivity().supportFragmentManager
                val fragmentTransaction =
                        fragmentManager.beginTransaction()
                val firstFragment = FirstFragment()
                firstFragment.arguments = bundle
                fragmentTransaction.replace(R.id.first_container, firstFragment)
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.commit()
            } else {
                Toast.makeText(
                        requireActivity().applicationContext,
                        "dygf",
                        Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}