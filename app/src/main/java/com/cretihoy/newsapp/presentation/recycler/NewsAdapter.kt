package com.cretihoy.newsapp.presentation.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.cretihoy.newsapp.R
import com.cretihoy.newsapp.domain.model.NewsModel

class NewsAdapter : RecyclerView.Adapter<NewsViewHolder>() {

    private var items = listOf<NewsModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.item_news,
                parent,
                false
            )
        return NewsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news = items[position]
        holder.run {
            image.load(news.imageUrl)
            title.text = news.title
        }
    }

    fun setItems(news: List<NewsModel>) {
        items = news.toMutableList()
        notifyDataSetChanged()
    }
}