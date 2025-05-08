package com.senanur.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.senanur.odev4.databinding.FragmentAnasayfaBinding
import com.senanur.odev4.databinding.FragmentSayfaXBinding


class SayfaXFragment : Fragment() {
    private lateinit var binding: FragmentSayfaXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSayfaXBinding.inflate(inflater, container, false)

        binding.button5.setOnClickListener {
            val gecis5 = SayfaXFragmentDirections.gecisY()
            Navigation.findNavController(it).navigate(gecis5)

        }
        return binding.root
    }


}