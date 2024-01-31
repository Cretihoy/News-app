package com.cretihoy.newsapp.presentation

import com.cretihoy.newsapp.domain.model.CategoryModel
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

interface MainView : MvpView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun populate(model: List<CategoryModel>)
}