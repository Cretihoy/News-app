package com.cretihoy.newsapp.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cretihoy.newsapp.R
import com.cretihoy.newsapp.data.di.DataModuleProvide
import com.cretihoy.newsapp.data.model.Category
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadNews()
    }

    private fun loadNews() {
        val okHttp = DataModuleProvide.provideOkHttpClient()
        val service = DataModuleProvide.provideApiClient(okHttp)
        CoroutineScope(Dispatchers.Main).launch {
            Category.values().forEach { category ->
                service.getAllBusinessNews(category)
            }
        }
    }
}