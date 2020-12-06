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

        recyclerView = binding.recyler

        recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)
            recyclerAdapter = RecyclerAdapter(listofVil)
            adapter = recyclerAdapter
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


}