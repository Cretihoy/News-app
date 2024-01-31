package com.cretihoy.newsapp.data.mapper

import com.cretihoy.newsapp.data.newmodel.ArticleDto
import com.cretihoy.newsapp.data.newmodel.Category
import com.cretihoy.newsapp.data.newmodel.CategoryResponse
import com.cretihoy.newsapp.domain.model.ArticleModel
import com.cretihoy.newsapp.domain.model.CategoryModel
import javax.inject.Inject

class ArticleMapper
@Inject constructor() {

    fun mapArticle(
        response: CategoryResponse,
        category: Category
    ): CategoryModel {
        return CategoryModel(
            articles = response.articles.map {
                mapArticle(it)
            },
            categoryTitle = category.title
        )
    }

    private fun mapArticle(article: ArticleDto): ArticleModel {
        return ArticleModel(
            imageUrl = article.urlToImage,
            title = article.title
        )
    }
}
