package com.cretihoy.newsapp.presentation

import com.cretihoy.newsapp.data.mapper.ArticleMapper
import com.cretihoy.newsapp.data.newmodel.Category
import com.cretihoy.newsapp.data.service.NewsService
import kotlinx.coroutines.launch
import moxy.InjectViewState
import moxy.MvpPresenter
import moxy.presenterScope
import javax.inject.Inject

@InjectViewState
class MainPresenter
@Inject constructor(
    private val service: NewsService,
    private val mapper: ArticleMapper
) : MvpPresenter<MainView>() {

    fun loadNews() {
        presenterScope.launch {
            val models = Category.values().map { category ->
                val response = service.getAllNewsByCategory(category)
                mapper.mapArticle(response, category)
            }
            viewState.populate(models)
        }
    }
}