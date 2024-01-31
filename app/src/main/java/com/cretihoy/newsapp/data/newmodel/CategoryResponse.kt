package com.cretihoy.newsapp.data.newmodel


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class CategoryResponse(
    @SerializedName("status")
    @Expose
    val status: String, // ok
    @SerializedName("totalResults")
    @Expose
    val totalResults: Int, // 38
    @SerializedName("articles")
    @Expose
    val articles: List<ArticleDto>
)