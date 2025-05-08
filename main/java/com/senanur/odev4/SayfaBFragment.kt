package com.senanur.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.senanur.odev4.databinding.FragmentAnasayfaBinding
import com.senanur.odev4.databinding.FragmentSayfaBBinding


class SayfaBFragment : Fragment() {
    private lateinit var binding: FragmentSayfaBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =FragmentSayfaBBinding.inflate(inflater, container, false)

        binding.button4.setOnClickListener {
            val gecis4 = SayfaBFragmentDirections.gecisBY()
            Navigation.findNavController(it).navigate(gecis4)

        }

        return binding.root
    }

}