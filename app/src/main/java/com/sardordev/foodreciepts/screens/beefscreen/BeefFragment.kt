package com.sardordev.foodreciepts.screens.beefscreen

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.sardordev.foodreciepts.R
import com.sardordev.foodreciepts.data.model.FoodDataModel
import com.sardordev.foodreciepts.databinding.FragmentBeefBinding
import com.sardordev.foodreciepts.screens.beefscreen.adapter.BeefAdapter
import com.sardordev.foodreciepts.utils.UiEvent
import com.sardordev.foodreciepts.viewmodel.BeefViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest

@AndroidEntryPoint
class BeefFragment : Fragment() {
    private val binding by lazy { FragmentBeefBinding.inflate(layoutInflater) }
    private val viewmodel by viewModels<BeefViewModel>()
    private lateinit var beefAdapter: BeefAdapter
    private lateinit var resultData: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewmodel.getBeefData()
        viewmodel.getChickenData()
        viewmodel.getSauceData()
        viewmodel.getVegeteriansData()
        viewmodel.getSoupesData()
        viewmodel.getSeaFoodsData()
        viewmodel.getBreakfastsData()
        viewmodel.getSnacksData()
        viewmodel.getPaultrysData()
        viewmodel.getDrinkssData()
        viewmodel.getDesertData()
        beefAdapter = BeefAdapter()


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        resultData = arguments?.getString("key")!!
        when (resultData) {
            "Beef" -> beefData()
            "Chiken" -> chickenData()
            "Sauce" -> sauceData()
            "Desserts" -> desertData()
            "VegeteriansFood" -> vegeterianData()
            "Soup" -> soupData()
            "Breakfast" -> breakfastData()
            "Snack" -> snackData()
            "Poultry" -> poutryData()
            "Drinks" -> drinksDataa()
        }

        initRv()
    }


    private fun beefData() {
        lifecycleScope.launchWhenCreated {
            viewmodel.beefobserver.collectLatest {
                when (it) {
                    UiEvent.Empty -> Unit
                    is UiEvent.Error -> {
                        Toast.makeText(
                            requireContext(),
                            it.message.toString(),
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }
                    UiEvent.Loading -> {
                        binding.progressbar.isVisible = true
                        binding.progressfoodname.isVisible = true
                        binding.tvRecipeCount.isVisible = false
                    }
                    is UiEvent.Success<*> -> {
                        binding.progressbar.isVisible = false
                        binding.progressfoodname.isVisible = false
                        binding.tvRecipeCount.isVisible = true
                        binding.tvFoodName.text = resultData.toString()
                        val foodlist = it.data as List<FoodDataModel>
                        beefAdapter.submitList(foodlist)
                        binding.tvRecipeCount.text = foodlist.size.toString()
                        Log.d("TTT", "${it.data}")
                    }
                    else -> {}
                }
            }
        }
    }

    private fun chickenData() {
        lifecycleScope.launchWhenCreated {
            viewmodel.chickenobserver.collectLatest {
                when (it) {
                    UiEvent.Empty -> Unit
                    is UiEvent.Error -> {
                        Toast.makeText(
                            requireContext(),
                            it.message.toString(),
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }
                    UiEvent.Loading -> {
                        binding.progressbar.isVisible = true
                        binding.progressfoodname.isVisible = true
                        binding.tvRecipeCount.isVisible = false
                    }
                    is UiEvent.Success<*> -> {
                        binding.progressbar.isVisible = false
                        binding.progressfoodname.isVisible = false
                        binding.tvRecipeCount.isVisible = true
                        binding.tvFoodName.text = resultData.toString()
                        val foodlist = it.data as List<FoodDataModel>
                        beefAdapter.submitList(foodlist)
                        binding.tvRecipeCount.text = foodlist.size.toString()
                        Log.d("TTT", "${it.data}")
                    }
                    else -> {}
                }
            }
        }
    }

    private fun initRv() {
        binding.rvfoods.apply {
            adapter = beefAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }


    private fun sauceData() {
        lifecycleScope.launchWhenCreated {
            viewmodel.sauceobserver.collectLatest {
                when (it) {
                    UiEvent.Empty -> Unit
                    is UiEvent.Error -> {
                        Toast.makeText(
                            requireContext(),
                            it.message.toString(),
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }
                    UiEvent.Loading -> {
                        binding.progressbar.isVisible = true
                        binding.progressfoodname.isVisible = true
                        binding.tvRecipeCount.isVisible = false
                    }
                    is UiEvent.Success<*> -> {
                        binding.progressbar.isVisible = false
                        binding.progressfoodname.isVisible = false
                        binding.tvRecipeCount.isVisible = true
                        binding.tvFoodName.text = resultData.toString()
                        val foodlist = it.data as List<FoodDataModel>
                        beefAdapter.submitList(foodlist)
                        binding.tvRecipeCount.text = foodlist.size.toString()
                        Log.d("TTT", "${it.data}")
                    }
                    else -> {}
                }
            }
        }
    }

    private fun desertData() {
        lifecycleScope.launchWhenCreated {
            viewmodel.dessertnobserver.collectLatest {
                when (it) {
                    UiEvent.Empty -> Unit
                    is UiEvent.Error -> {
                        Toast.makeText(
                            requireContext(),
                            it.message.toString(),
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }
                    UiEvent.Loading -> {
                        binding.progressbar.isVisible = true
                        binding.progressfoodname.isVisible = true
                        binding.tvRecipeCount.isVisible = false
                    }
                    is UiEvent.Success<*> -> {
                        binding.progressbar.isVisible = false
                        binding.progressfoodname.isVisible = false
                        binding.tvRecipeCount.isVisible = true
                        binding.tvFoodName.text = resultData.toString()
                        val foodlist = it.data as List<FoodDataModel>
                        beefAdapter.submitList(foodlist)
                        binding.tvRecipeCount.text = foodlist.size.toString()
                        Log.d("TTT", "${it.data}")
                    }
                    else -> {}
                }
            }
        }
    }

    private fun vegeterianData() {
        lifecycleScope.launchWhenCreated {
            viewmodel.vegeteriannobserver.collectLatest {
                when (it) {
                    UiEvent.Empty -> Unit
                    is UiEvent.Error -> {
                        Toast.makeText(
                            requireContext(),
                            it.message.toString(),
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }
                    UiEvent.Loading -> {
                        binding.progressbar.isVisible = true
                        binding.progressfoodname.isVisible = true
                        binding.tvRecipeCount.isVisible = false
                    }
                    is UiEvent.Success<*> -> {
                        binding.progressbar.isVisible = false
                        binding.progressfoodname.isVisible = false
                        binding.tvRecipeCount.isVisible = true
                        binding.tvFoodName.text = resultData.toString()
                        val foodlist = it.data as List<FoodDataModel>
                        beefAdapter.submitList(foodlist)
                        binding.tvRecipeCount.text = foodlist.size.toString()
                        Log.d("TTT", "${it.data}")
                    }
                    else -> {}
                }
            }
        }
    }


    private fun soupData() {
        lifecycleScope.launchWhenCreated {
            viewmodel.soupeobserver.collectLatest {
                when (it) {
                    UiEvent.Empty -> Unit
                    is UiEvent.Error -> {
                        Toast.makeText(
                            requireContext(),
                            it.message.toString(),
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }
                    UiEvent.Loading -> {
                        binding.progressbar.isVisible = true
                        binding.progressfoodname.isVisible = true
                        binding.tvRecipeCount.isVisible = false
                    }
                    is UiEvent.Success<*> -> {
                        binding.progressbar.isVisible = false
                        binding.progressfoodname.isVisible = false
                        binding.tvRecipeCount.isVisible = true
                        binding.tvFoodName.text = resultData.toString()
                        val foodlist = it.data as List<FoodDataModel>
                        beefAdapter.submitList(foodlist)
                        binding.tvRecipeCount.text = foodlist.size.toString()
                        Log.d("TTT", "${it.data}")
                    }
                    else -> {}
                }
            }
        }
    }

    private fun seafood() {
        lifecycleScope.launchWhenCreated {
            viewmodel.seafoodobserver.collectLatest {
                when (it) {
                    UiEvent.Empty -> Unit
                    is UiEvent.Error -> {
                        Toast.makeText(
                            requireContext(),
                            it.message.toString(),
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }
                    UiEvent.Loading -> {
                        binding.progressbar.isVisible = true
                        binding.progressfoodname.isVisible = true
                        binding.tvRecipeCount.isVisible = false
                    }
                    is UiEvent.Success<*> -> {
                        binding.progressbar.isVisible = false
                        binding.progressfoodname.isVisible = false
                        binding.tvRecipeCount.isVisible = true
                        binding.tvFoodName.text = resultData.toString()
                        val foodlist = it.data as List<FoodDataModel>
                        beefAdapter.submitList(foodlist)
                        binding.tvRecipeCount.text = foodlist.size.toString()
                        Log.d("TTT", "${it.data}")
                    }
                    else -> {}
                }
            }
        }
    }

    private fun breakfastData() {
        lifecycleScope.launchWhenCreated {
            viewmodel.breakfastobserver.collectLatest {
                when (it) {
                    UiEvent.Empty -> Unit
                    is UiEvent.Error -> {
                        Toast.makeText(
                            requireContext(),
                            it.message.toString(),
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }
                    UiEvent.Loading -> {
                        binding.progressbar.isVisible = true
                        binding.progressfoodname.isVisible = true
                        binding.tvRecipeCount.isVisible = false
                    }
                    is UiEvent.Success<*> -> {
                        binding.progressbar.isVisible = false
                        binding.progressfoodname.isVisible = false
                        binding.tvRecipeCount.isVisible = true
                        binding.tvFoodName.text = resultData.toString()
                        val foodlist = it.data as List<FoodDataModel>
                        beefAdapter.submitList(foodlist)
                        binding.tvRecipeCount.text = foodlist.size.toString()
                        Log.d("TTT", "${it.data}")
                    }
                    else -> {}
                }
            }
        }
    }

    private fun snackData() {
        lifecycleScope.launchWhenCreated {
            viewmodel.snackobserver.collectLatest {
                when (it) {
                    UiEvent.Empty -> Unit
                    is UiEvent.Error -> {
                        Toast.makeText(
                            requireContext(),
                            it.message.toString(),
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }
                    UiEvent.Loading -> {
                        binding.progressbar.isVisible = true
                        binding.progressfoodname.isVisible = true
                        binding.tvRecipeCount.isVisible = false
                    }
                    is UiEvent.Success<*> -> {
                        binding.progressbar.isVisible = false
                        binding.progressfoodname.isVisible = false
                        binding.tvRecipeCount.isVisible = true
                        binding.tvFoodName.text = resultData.toString()
                        val foodlist = it.data as List<FoodDataModel>
                        beefAdapter.submitList(foodlist)
                        binding.tvRecipeCount.text = foodlist.size.toString()
                        Log.d("TTT", "${it.data}")
                    }
                    else -> {}
                }
            }
        }
    }

    private fun poutryData() {
        lifecycleScope.launchWhenCreated {
            viewmodel.pautryobserver.collectLatest {
                when (it) {
                    UiEvent.Empty -> Unit
                    is UiEvent.Error -> {
                        Toast.makeText(
                            requireContext(),
                            it.message.toString(),
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }
                    UiEvent.Loading -> {
                        binding.progressbar.isVisible = true
                        binding.progressfoodname.isVisible = true
                        binding.tvRecipeCount.isVisible = false
                    }
                    is UiEvent.Success<*> -> {
                        binding.progressbar.isVisible = false
                        binding.progressfoodname.isVisible = false
                        binding.tvRecipeCount.isVisible = true
                        binding.tvFoodName.text = resultData.toString()
                        val foodlist = it.data as List<FoodDataModel>
                        beefAdapter.submitList(foodlist)
                        binding.tvRecipeCount.text = foodlist.size.toString()
                        Log.d("TTT", "${it.data}")
                    }
                    else -> {}
                }
            }
        }
    }

    private fun drinksDataa() {
        lifecycleScope.launchWhenCreated {
            viewmodel.drinksobserver.collectLatest {
                when (it) {
                    UiEvent.Empty -> Unit
                    is UiEvent.Error -> {
                        Toast.makeText(
                            requireContext(),
                            it.message.toString(),
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }
                    UiEvent.Loading -> {
                        binding.progressbar.isVisible = true
                        binding.progressfoodname.isVisible = true
                        binding.tvRecipeCount.isVisible = false
                    }
                    is UiEvent.Success<*> -> {
                        binding.progressbar.isVisible = false
                        binding.progressfoodname.isVisible = false
                        binding.tvRecipeCount.isVisible = true
                        binding.tvFoodName.text = resultData.toString()
                        val foodlist = it.data as List<FoodDataModel>
                        beefAdapter.submitList(foodlist)
                        binding.tvRecipeCount.text = foodlist.size.toString()
                        Log.d("TTT", "${it.data}")
                    }
                    else -> {}
                }
            }
        }
    }

}