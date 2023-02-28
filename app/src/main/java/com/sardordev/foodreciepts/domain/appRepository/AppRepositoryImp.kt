package com.sardordev.foodreciepts.domain.appRepository

import com.sardordev.foodreciepts.data.api.FoodApi
import com.sardordev.foodreciepts.data.model.FoodDataModel
import com.sardordev.foodreciepts.utils.ResourseUI
import javax.inject.Inject

class AppRepositoryImp @Inject constructor(private val api: FoodApi) : AppRepository {

    override suspend fun getBeefData(): ResourseUI<List<FoodDataModel>> {
        return try {
            val result = api.getBeefData()
            if (result.isSuccessful) {
                ResourseUI.Success(result.body())
            } else {
                ResourseUI.Error(message = result.message())
            }

        } catch (e: Exception) {
            ResourseUI.Error(message = e.message)
        }
    }

    override suspend fun getChickenData(): ResourseUI<List<FoodDataModel>> {
        return try {
            val result = api.getChickedData()
            if (result.isSuccessful) {
                ResourseUI.Success(result.body())
            } else {
                ResourseUI.Error(message = result.message())
            }

        } catch (e: Exception) {
            ResourseUI.Error(message = e.message)
        }
    }

    override suspend fun getSauceData(): ResourseUI<List<FoodDataModel>> {
        return try {
            val result = api.getSausceData()
            if (result.isSuccessful) {
                ResourseUI.Success(result.body())
            } else {
                ResourseUI.Error(message = result.message())
            }

        } catch (e: Exception) {
            ResourseUI.Error(message = e.message)
        }
    }

    override suspend fun getDessertsData(): ResourseUI<List<FoodDataModel>> {
        return try {
            val result = api.getDessertData()
            if (result.isSuccessful) {
                ResourseUI.Success(result.body())
            } else {
                ResourseUI.Error(message = result.message())
            }
        } catch (e: Exception) {
            ResourseUI.Error(message = e.message)
        }
    }

    override suspend fun getVegeteriansData(): ResourseUI<List<FoodDataModel>> {
        return try {
            val result = api.getVegeterianData()
            if (result.isSuccessful) {
                ResourseUI.Success(result.body())
            } else {
                ResourseUI.Error(message = result.message())
            }

        } catch (e: Exception) {
            ResourseUI.Error(message = e.message)
        }
    }

    override suspend fun getSoupesData(): ResourseUI<List<FoodDataModel>> {
        return try {
            val result = api.getSoupeData()
            if (result.isSuccessful) {
                ResourseUI.Success(result.body())
            } else {
                ResourseUI.Error(message = result.message())
            }

        } catch (e: Exception) {
            ResourseUI.Error(message = e.message)
        }
    }

    override suspend fun getSeaFoodsData(): ResourseUI<List<FoodDataModel>> {
        return try {
            val result = api.getSeaFoodData()
            if (result.isSuccessful) {
                ResourseUI.Success(result.body())
            } else {
                ResourseUI.Error(message = result.message())
            }

        } catch (e: Exception) {
            ResourseUI.Error(message = e.message)
        }
    }

    override suspend fun getBreakfastsData(): ResourseUI<List<FoodDataModel>> {
        return try {
            val result = api.getBreakfastData()
            if (result.isSuccessful) {
                ResourseUI.Success(result.body())
            } else {
                ResourseUI.Error(message = result.message())
            }

        } catch (e: Exception) {
            ResourseUI.Error(message = e.message)
        }
    }

    override suspend fun getSnacksData(): ResourseUI<List<FoodDataModel>> {
        return try {
            val result = api.getSnackData()
            if (result.isSuccessful) {
                ResourseUI.Success(result.body())
            } else {
                ResourseUI.Error(message = result.message())
            }

        } catch (e: Exception) {
            ResourseUI.Error(message = e.message)
        }
    }

    override suspend fun getPaultrysData(): ResourseUI<List<FoodDataModel>> {
        return try {
            val result = api.getPaultryData()
            if (result.isSuccessful) {
                ResourseUI.Success(result.body())
            } else {
                ResourseUI.Error(message = result.message())
            }

        } catch (e: Exception) {
            ResourseUI.Error(message = e.message)
        }
    }

    override suspend fun getDrinkssData(): ResourseUI<List<FoodDataModel>> {
        return try {
            val result = api.getDrinksData()
            if (result.isSuccessful) {
                ResourseUI.Success(result.body())
            } else {
                ResourseUI.Error(message = result.message())
            }

        } catch (e: Exception) {
            ResourseUI.Error(message = e.message)
        }
    }


}