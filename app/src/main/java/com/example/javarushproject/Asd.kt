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
import com.example.javarushproject.FirstFragment
import com.example.javarushproject.R
import com.example.javarushproject.model.Animal
import com.example.javarushproject.model.Cat
import com.example.javarushproject.model.Dog
import java.util.*

class StartFragment : Fragment() {
    lateinit var quantityText: TextView
    var plusBtn: Button? = null
    var minusBtn: Button? = null
    var quantityBtn: Button? = null
    var itemAmount = 0
    var plsMnsCount = 1
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
        val animals = arrayOf(
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
        val animals1 = LinkedList<Animal>()
        for (i in animals.indices) {
            Log.d("TEST", "zhivotnie =" + animals[i].toString())
        }
        val animalHashMap = HashMap<String, Animal>()
        animalHashMap["Аляск а"] = first_sobaka
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Log.d("TEST", "mapResult " + animalHashMap["Аляска"])
        }
        plusBtn.setOnClickListener(View.OnClickListener { plusView: View? ->
            itemAmount += plsMnsCount
            quantityText.setText(itemAmount.toString())
        })
        minusBtn.setOnClickListener(View.OnClickListener { minusView: View? ->
            itemAmount -= plsMnsCount
            quantityText.setText(itemAmount.toString())
        })
        quantityBtn.setOnClickListener(View.OnClickListener { quantityView: View? ->
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
        })
    }
}