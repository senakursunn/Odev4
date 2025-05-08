package com.senanur.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.senanur.odev4.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.button1.setOnClickListener {
            val gecis1 = AnasayfaFragmentDirections.gecisA()
            Navigation.findNavController(it).navigate(gecis1)

        }
        binding.button2.setOnClickListener {
            val gecis2 = AnasayfaFragmentDirections.gecisX()
            Navigation.findNavController(it).navigate(gecis2)

        }

        return binding.root
    }
}