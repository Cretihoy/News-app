package com.cretihoy.newsapp.data.newmodel


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Source(
    @SerializedName("id")
    @Expose
    val id: String?, // associated-press
    @SerializedName("name")
    @Expose
    val name: String // Forbes
)