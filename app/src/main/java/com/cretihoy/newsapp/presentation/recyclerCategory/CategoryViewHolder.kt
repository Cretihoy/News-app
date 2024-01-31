package com.cretihoy.newsapp.presentation.recyclerCategory

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cretihoy.newsapp.R
import com.cretihoy.newsapp.presentation.recyclerArticle.ArticleAdapter

class CategoryViewHolder(
    itemView: View
) : RecyclerView.ViewHolder(itemView) {
    val adapter = ArticleAdapter()
    val recycler: RecyclerView by lazy { itemView.findViewById(R.id.item_category_recycler) }
    val categoryName: TextView by lazy { itemView.findViewById(R.id.item_category_title) }
}