package com.example.fridayapp.network

import com.example.fridayapp.models.RecyclerList
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService {

    @GET("repositories")
    suspend fun getDataFromApi(@Query("q") query: String) : RecyclerList

}