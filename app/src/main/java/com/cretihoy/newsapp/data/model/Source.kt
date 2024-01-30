package com.cretihoy.newsapp.data.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Source(
    @SerializedName("id")
    @Expose
    val id: String, // google-news
    @SerializedName("name")
    @Expose
    val name: String // Google News
)