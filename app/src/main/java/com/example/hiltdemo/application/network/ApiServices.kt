package com.example.hiltdemo.application.network

import com.example.hiltdemo.application.data.PhotoModel
import com.example.hiltdemo.application.utils.Constants.API_KEY
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiServices {

    @Headers("Authorization: Client-ID $API_KEY")
    @GET("photos")
    fun getImageListResponse(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): Call<List<PhotoModel>>

}