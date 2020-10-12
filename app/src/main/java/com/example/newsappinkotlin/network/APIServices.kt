package com.example.newsappinkotlin.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

// single end point to get top headlines in the USA
interface APIServices {
    @GET("v2/top-headlines")

    fun getAllHeadlines(@Query("apiKey") apiKey:String="2a95de631f554998a8f6a20a9ee46103",@Query("page") pageNumber:Int=1
                        ,@Query("country") country:String="us")
            :Call<NewsResponse>
}