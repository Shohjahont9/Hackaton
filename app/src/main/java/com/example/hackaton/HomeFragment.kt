package com.example.hackaton

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hackaton.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var recyclerView2: RecyclerView
    lateinit var reAdapter: AksiyaAdapter
    val listOfAksiya: MutableList<Aksiya> = ArrayList()
    lateinit var recyclerAdapter: RecyclerAdapter
    var listofVil: MutableList<Viloyat> = ArrayList()
    lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.myFb.setColorFilter(Color.WHITE)

        listofVil.clear()

        init()
        init1()
        recyclerView = binding.recyler
        recyclerView2 = binding.recyler1

        recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)
            recyclerAdapter = RecyclerAdapter(listofVil)
            adapter = recyclerAdapter
        }
        recyclerView2.apply {
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            reAdapter = AksiyaAdapter(listOfAksiya)
            adapter = reAdapter
        }



        requireActivity().setContentView(binding.root)

        return view
    }

    private fun init() {
        listofVil.add(Viloyat(R.drawable.toshkent, "Toshkent"))
        listofVil.add(Viloyat(R.drawable.samarqand, "Samarqand"))
        listofVil.add(Viloyat(R.drawable.qarshi, "Qarshi"))
        listofVil.add(Viloyat(R.drawable.navoiy, "Navoiy"))
        listofVil.add(Viloyat(R.drawable.termiz, "Termiz"))
        listofVil.add(Viloyat(R.drawable.nukus, "Nukus"))
        listofVil.add(Viloyat(R.drawable.guliston, "Guliston"))
        listofVil.add(Viloyat(R.drawable.andijon, "Andijon"))

    }

    private fun init1() {
        listOfAksiya.add(Aksiya(R.drawable.uzkim, "Uz Kimyosanoat", "0.01", "$20"))
        listOfAksiya.add(Aksiya(R.drawable.uzcharm, "Uz Charmsanoat", "0.5", "$110"))
        listOfAksiya.add(Aksiya(R.drawable.qizilqum, "Qizilqum", "2", "$2000"))
        listOfAksiya.add(Aksiya(R.drawable.tosh, "Toshkent kompinat", "1", "$20000"))
        listOfAksiya.add(Aksiya(R.drawable.korea, "Korean Air", "0.2", "$1500"))
        listOfAksiya.add(Aksiya(R.drawable.toshkent, "Tosh shahar Avtosanoat", "1", "$500"))
        listOfAksiya.add(Aksiya(R.drawable.navoiy, "NavoiAzot", "20", "$170"))
        listOfAksiya.add(Aksiya(R.drawable.jizzax, "Jizzax sanoat", "7", "$1500"))
        listOfAksiya.add(Aksiya(R.drawable.andijon, "UzAutoMotors AJ", "1", "$250000"))
    }


}