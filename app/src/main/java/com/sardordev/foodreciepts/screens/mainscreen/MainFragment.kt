package com.sardordev.foodreciepts.screens.mainscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.sardordev.foodreciepts.R
import com.sardordev.foodreciepts.databinding.FragmentMainBinding
import dagger.hilt.android.AndroidEntryPoint


/**
created Main Screen

 */
@AndroidEntryPoint
class MainFragment : Fragment() {
    private val binding by lazy { FragmentMainBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.beefContainer.setOnClickListener {
            navigateTo("Beef")
        }

        binding.imgChicken.setOnClickListener {
           navigateTo("Chiken")
        }

        binding.imgsauce.setOnClickListener {
            navigateTo("Sauce")
        }

        binding.imgbeef.setOnClickListener {
            navigateTo("Beef")
        }

        binding.imgdessert.setOnClickListener {
            navigateTo("Desserts")
        }

        binding.imgvege.setOnClickListener {
            navigateTo("VegeteriansFood")
        }

        binding.imgsoupe.setOnClickListener {
            navigateTo("Soup")
        }

        binding.imgseafood.setOnClickListener {
            navigateTo("SeaFood")
        }

        binding.imgbrekfast.setOnClickListener {
            navigateTo("Breakfast")
        }
        binding.imgsnack.setOnClickListener {
            navigateTo("Snack")
        }

        binding.imgpoultry.setOnClickListener {
            navigateTo("Poultry")
        }
        binding.imgdrinks.setOnClickListener {
            navigateTo("Drinks")
        }





        return binding.root
    }

    private fun navigateTo(key:String){
        val enterkey = bundleOf("key" to key)
        findNavController().navigate(R.id.beefFragment, enterkey)
    }



}