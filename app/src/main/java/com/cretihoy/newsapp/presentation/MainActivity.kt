package com.cretihoy.newsapp.presentation

import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.cretihoy.newsapp.R
import com.cretihoy.newsapp.domain.model.CategoryModel
import com.cretihoy.newsapp.presentation.recyclerCategory.CategoryAdapter
import dagger.hilt.android.AndroidEntryPoint
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter
import javax.inject.Inject
import javax.inject.Provider

@AndroidEntryPoint
class MainActivity : MvpAppCompatActivity(), MainView {

    private val recycler: RecyclerView by lazy { findViewById(R.id.main_recycler_business_news) }
    private val adapter = CategoryAdapter()

    @Inject
    lateinit var presenterProvider: Provider<MainPresenter>
    private val presenter by moxyPresenter { presenterProvider.get() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.adapter = adapter
        presenter.loadNews()
    }

    override fun populate(result: List<CategoryModel>) {
        adapter.setItems(result)
    }
}