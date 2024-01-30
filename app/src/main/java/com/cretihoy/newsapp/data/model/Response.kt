package com.cretihoy.newsapp.data.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Response(
    @SerializedName("source")
    @Expose
    val source: Source,
    @SerializedName("author")
    @Expose
    val author: String, // FRANCE 24 Español
    @SerializedName("title")
    @Expose
    val title: String, // Crisis inmobiliaria en China: Evergrande, a liquidación - FRANCE 24 Español
    @SerializedName("description")
    @Expose
    val description: Any?, // null
    @SerializedName("url")
    @Expose
    val url: String, // https://news.google.com/rss/articles/CCAiC0JEbk8tMm9OekMwmAEB?oc=5
    @SerializedName("urlToImage")
    @Expose
    val urlToImage: Any?, // null
    @SerializedName("publishedAt")
    @Expose
    val publishedAt: String, // 2024-01-29T14:24:56Z
    @SerializedName("content")
    @Expose
    val content: Any? // null
)