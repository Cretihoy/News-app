package com.cretihoy.newsapp.presentation.recyclerCategory

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cretihoy.newsapp.R
import com.cretihoy.newsapp.domain.model.CategoryModel

class CategoryAdapter : RecyclerView.Adapter<CategoryViewHolder>() {

    private var items = listOf<CategoryModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.item_category,
                parent,
                false
            )
        return CategoryViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = items[position]
        holder.run {
            categoryName.text = category.categoryTitle
            recycler.adapter = adapter
            adapter.setItems(category.articles)
        }
    }

    fun setItems(news: List<CategoryModel>) {
        items = news.toMutableList()
        notifyDataSetChanged()
    }
}