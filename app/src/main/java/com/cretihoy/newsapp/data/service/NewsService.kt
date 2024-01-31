package com.cretihoy.newsapp.data.service

import com.cretihoy.newsapp.data.newmodel.Category
import com.cretihoy.newsapp.data.newmodel.CategoryResponse
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "6ce37518fa0a4776af79bf8ee21c120d"

interface NewsService {

    @GET("/v2/top-headlines")
    suspend fun getAllNewsByCategory(
        @Query("category") category: Category,
        @Query("apiKey") apiKey: String = API_KEY,
        @Query("pageSize") pageSize: Int = 20,
        @Query("page") page: Int = 1
    ): CategoryResponse
}