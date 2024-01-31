package com.cretihoy.newsapp.data.newmodel

import com.google.gson.annotations.SerializedName

enum class Category(
    val title: String
) {

    @SerializedName("business")
    BUSINESS("Business"),

    @SerializedName("entertainment")
    ENTERTAINMENT("Entertainment"),

    @SerializedName("general")
    GENERAL("General"),

    @SerializedName("health")
    HEALTH("Health"),

    @SerializedName("science")
    SCIENCE("Science"),

    @SerializedName("sports")
    SPORTS("Sports"),

    @SerializedName("technology")
    TECHNOLOGY("Technology")
}