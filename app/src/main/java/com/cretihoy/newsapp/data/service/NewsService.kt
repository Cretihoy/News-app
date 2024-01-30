package com.cretihoy.newsapp.data.service

import retrofit2.http.GET

private const val API_KEY = "6ce37518fa0a4776af79bf8ee21c120d"

interface NewsService {

    @GET("/v2/top-headlines/business/$API_KEY")
    suspend fun getAllBusinessNews(): Any
}