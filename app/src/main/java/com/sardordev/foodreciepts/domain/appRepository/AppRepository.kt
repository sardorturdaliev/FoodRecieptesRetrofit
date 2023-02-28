package com.sardordev.foodreciepts.domain.appRepository

import com.sardordev.foodreciepts.data.model.FoodDataModel
import com.sardordev.foodreciepts.utils.ResourseUI

interface AppRepository {
    suspend fun getBeefData(): ResourseUI<List<FoodDataModel>>
    suspend fun getChickenData(): ResourseUI<List<FoodDataModel>>
    suspend fun getSauceData(): ResourseUI<List<FoodDataModel>>

    suspend fun getDessertsData(): ResourseUI<List<FoodDataModel>>
    suspend fun getVegeteriansData(): ResourseUI<List<FoodDataModel>>
    suspend fun getSoupesData(): ResourseUI<List<FoodDataModel>>
    suspend fun getSeaFoodsData(): ResourseUI<List<FoodDataModel>>
    suspend fun getBreakfastsData(): ResourseUI<List<FoodDataModel>>
    suspend fun getSnacksData(): ResourseUI<List<FoodDataModel>>
    suspend fun getPaultrysData(): ResourseUI<List<FoodDataModel>>
    suspend fun getDrinkssData(): ResourseUI<List<FoodDataModel>>


}