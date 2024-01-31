package com.cretihoy.newsapp.domain.model

data class CategoryModel(
    val articles: List<ArticleModel>,
    val categoryName: String
)