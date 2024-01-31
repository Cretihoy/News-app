package com.cretihoy.newsapp.presentation.recyclerArticle

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.cretihoy.newsapp.R
import com.cretihoy.newsapp.domain.model.ArticleModel

class ArticleAdapter : RecyclerView.Adapter<ArticleViewHolder>() {

    private var items = listOf<ArticleModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.item_article,
                parent,
                false
            )
        return ArticleViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = items[position]
        holder.run {
            title.text = article.title
            if (article.imageUrl == null) {
                null
            } else {
                image.load(article.imageUrl)
            }
        }
    }

    fun setItems(news: List<ArticleModel>) {
        items = news.toMutableList()
        notifyDataSetChanged()
    }
}