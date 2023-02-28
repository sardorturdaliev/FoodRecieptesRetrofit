package com.sardordev.foodreciepts.screens.beefscreen.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sardordev.foodreciepts.data.model.FoodDataModel
import com.sardordev.foodreciepts.databinding.CardItemFoodsBinding

class BeefAdapter : ListAdapter<FoodDataModel, BeefAdapter.VH>(diff) {


    inner class VH(val bindig: CardItemFoodsBinding) : RecyclerView.ViewHolder(bindig.root) {

        fun onbind(foodDataModel: FoodDataModel) {

            bindig.tvFoodName.text = foodDataModel.recipe
            bindig.tvFoodMinute.text = "${foodDataModel.prep_time_in_minutes} min"

            Glide.with(itemView.context).load(foodDataModel.image).into(bindig.imgFood)
        }

    }

    object diff : DiffUtil.ItemCallback<FoodDataModel>() {
        override fun areItemsTheSame(oldItem: FoodDataModel, newItem: FoodDataModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: FoodDataModel, newItem: FoodDataModel): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = VH(
        CardItemFoodsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onbind(getItem(position))
    }

}