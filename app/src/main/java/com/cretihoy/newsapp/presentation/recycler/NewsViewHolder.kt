package com.cretihoy.newsapp.presentation.recycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cretihoy.newsapp.R

class NewsViewHolder(
    itemView: View
) : RecyclerView.ViewHolder(itemView) {

    val image: ImageView by lazy { itemView.findViewById(R.id.item_image) }
    val title: TextView by lazy { itemView.findViewById(R.id.item_text_title) }
}