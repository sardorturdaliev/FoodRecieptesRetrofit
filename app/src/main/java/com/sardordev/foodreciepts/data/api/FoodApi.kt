package com.sardordev.foodreciepts.data.api

import com.sardordev.foodreciepts.data.model.FoodDataModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface FoodApi {


    @GET("?category=3")
    @Headers(
        "X-RapidAPI-Key: a8a0b22bafmsh860bf319ead8259p1d8b1ajsna514c38b7589",
        "X-RapidAPI-Host: keto-diet.p.rapidapi.com"
    )
    suspend fun getBeefData(): Response<List<FoodDataModel>>


    @GET("?search=Chicken")
    @Headers(
        "X-RapidAPI-Key: a8a0b22bafmsh860bf319ead8259p1d8b1ajsna514c38b7589",
        "X-RapidAPI-Host: keto-diet.p.rapidapi.com"
    )
    suspend fun getChickedData(): Response<List<FoodDataModel>>


    @GET("?search=sauce")
    @Headers(
        "X-RapidAPI-Key: a8a0b22bafmsh860bf319ead8259p1d8b1ajsna514c38b7589",
        "X-RapidAPI-Host: keto-diet.p.rapidapi.com"
    )
    suspend fun getSausceData(): Response<List<FoodDataModel>>


    @GET("?category=8")
    @Headers(
        "X-RapidAPI-Key: a8a0b22bafmsh860bf319ead8259p1d8b1ajsna514c38b7589",
        "X-RapidAPI-Host: keto-diet.p.rapidapi.com"
    )
    suspend fun getDessertData(): Response<List<FoodDataModel>>

    @GET("?category=9")
    @Headers(
        "X-RapidAPI-Key: a8a0b22bafmsh860bf319ead8259p1d8b1ajsna514c38b7589",
        "X-RapidAPI-Host: keto-diet.p.rapidapi.com"
    )
    suspend fun getVegeterianData(): Response<List<FoodDataModel>>


    @GET("?category=7")
    @Headers(
        "X-RapidAPI-Key: a8a0b22bafmsh860bf319ead8259p1d8b1ajsna514c38b7589",
        "X-RapidAPI-Host: keto-diet.p.rapidapi.com"
    )
    suspend fun getSoupeData(): Response<List<FoodDataModel>>


    @GET("?category=6")
    @Headers(
        "X-RapidAPI-Key: a8a0b22bafmsh860bf319ead8259p1d8b1ajsna514c38b7589",
        "X-RapidAPI-Host: keto-diet.p.rapidapi.com"
    )
    suspend fun getSeaFoodData(): Response<List<FoodDataModel>>


    @GET("?category=1")
    @Headers(
        "X-RapidAPI-Key: a8a0b22bafmsh860bf319ead8259p1d8b1ajsna514c38b7589",
        "X-RapidAPI-Host: keto-diet.p.rapidapi.com"
    )
    suspend fun getBreakfastData(): Response<List<FoodDataModel>>


    @GET("?category=2")
    @Headers(
        "X-RapidAPI-Key: a8a0b22bafmsh860bf319ead8259p1d8b1ajsna514c38b7589",
        "X-RapidAPI-Host: keto-diet.p.rapidapi.com"
    )
    suspend fun getSnackData(): Response<List<FoodDataModel>>


    @GET("?category=5")
    @Headers(
        "X-RapidAPI-Key: a8a0b22bafmsh860bf319ead8259p1d8b1ajsna514c38b7589",
        "X-RapidAPI-Host: keto-diet.p.rapidapi.com"
    )
    suspend fun getPaultryData(): Response<List<FoodDataModel>>



    @GET("?category=11")
    @Headers(
        "X-RapidAPI-Key: a8a0b22bafmsh860bf319ead8259p1d8b1ajsna514c38b7589",
        "X-RapidAPI-Host: keto-diet.p.rapidapi.com"
    )
    suspend fun getDrinksData(): Response<List<FoodDataModel>>


}