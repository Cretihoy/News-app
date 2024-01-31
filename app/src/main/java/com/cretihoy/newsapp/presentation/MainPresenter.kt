package com.cretihoy.newsapp.presentation

import moxy.InjectViewState
import moxy.MvpPresenter
import javax.inject.Inject

@InjectViewState
class MainPresenter
@Inject constructor() : MvpPresenter<MainView>() {
}