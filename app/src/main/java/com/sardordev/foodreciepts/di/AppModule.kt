package com.sardordev.foodreciepts.di

import com.google.gson.Gson
import com.sardordev.foodreciepts.data.api.FoodApi
import com.sardordev.foodreciepts.domain.appRepository.AppRepository
import com.sardordev.foodreciepts.domain.appRepository.AppRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun getApi(): FoodApi {
        return Retrofit.Builder()
            .baseUrl("https://keto-diet.p.rapidapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(FoodApi::class.java)
    }



    @Singleton
    @Provides
    fun getAppRepository(api: FoodApi): AppRepository = AppRepositoryImp(api)



}