package com.senanur.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.senanur.odev4.databinding.FragmentAnasayfaBinding
import com.senanur.odev4.databinding.FragmentSayfaABinding

class SayfaAFragment : Fragment() {
    private lateinit var binding: FragmentSayfaABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaABinding.inflate(inflater, container, false)

        binding.button3.setOnClickListener {
            val gecis3 = SayfaAFragmentDirections.gecisB()
            Navigation.findNavController(it).navigate(gecis3)

        }

        return binding.root
    }


}