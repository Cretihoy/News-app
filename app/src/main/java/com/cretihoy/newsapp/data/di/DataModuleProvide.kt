package com.cretihoy.newsapp.data.di

import com.cretihoy.newsapp.data.service.NewsService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

private const val BASE_URL = "https://newsapi.org"
private const val TIMEOUT = 10L

@Module
@InstallIn(SingletonComponent::class)
object DataModuleProvide {

    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient =
        with(OkHttpClient.Builder()) {
            connectTimeout(TIMEOUT, TimeUnit.SECONDS)
            readTimeout(TIMEOUT, TimeUnit.SECONDS)

            addNetworkInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })

            build()
        }

    @Provides
    fun provideApiClient(
        httpClient: OkHttpClient
    ): NewsService {
        return Retrofit.Builder()
            .client(httpClient)
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NewsService::class.java)
    }
}