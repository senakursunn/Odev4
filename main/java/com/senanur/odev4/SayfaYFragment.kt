package com.senanur.odev4

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import com.senanur.odev4.databinding.FragmentAnasayfaBinding
import com.senanur.odev4.databinding.FragmentSayfaYBinding


class SayfaYFragment : Fragment() {
    private lateinit var binding: FragmentSayfaYBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaYBinding.inflate(inflater, container, false)

        val geriTusu= object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                Log.e( "SayfaY", "Geri Tuşu çalıştı. ")

            }

        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,geriTusu)
        return binding.root
    }


}