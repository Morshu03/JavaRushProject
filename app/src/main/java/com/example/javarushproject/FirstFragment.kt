package com.example.javarushproject

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.javarushproject.adapter.AnimalAdapter
import com.example.javarushproject.model.Animal
import com.example.javarushproject.model.Cat
import com.example.javarushproject.model.Dog


class FirstFragment : Fragment() {

    private lateinit var textView: TextView
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AnimalAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recView)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = AnimalAdapter(animals)


        val first_sobaka = Dog(30, 65, "Аляска")
        val second_sobaka = Dog(25, 60, "Каспер")
        val third_sobaka = Dog(12, 35, "Бульдог")
        val fourth_sobaka = Dog(13, 36, "Значение_знаешь?")
        val fifth_sobaka = Dog(14, 37, "Буль_ДОГ")
        val pervaya_koshka = Cat(15, 15, "Домашнич", 8)
        val vtoraya_koshka = Cat(10, 12, "Помойнич", 1)
        val tretiya_koshka = Cat(2, 3, "Новорождёныч", 8)
        val chetvertaya_koska = Cat(15, 1, "Приведеныч", 0)
        val pyataya_koshka = Cat(12, 14, "Томыч", 3)

        
        val animals = arrayListOf<Animal>(
            first_sobaka,
            second_sobaka,
            third_sobaka,
            fourth_sobaka,
            fifth_sobaka,
            pervaya_koshka,
            vtoraya_koshka,
            tretiya_koshka,
            chetvertaya_koska,
            pyataya_koshka
        )

        for (i in animals.indices) {
            Log.d("TEST", "zhivotnie =" + animals[i].toString())
        }
        val animalHashMap = HashMap<String, Animal>()
        animalHashMap["Аляск а"] = first_sobaka
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Log.d("TEST", "mapResult " + animalHashMap["Аляска"])
        }
    }

}