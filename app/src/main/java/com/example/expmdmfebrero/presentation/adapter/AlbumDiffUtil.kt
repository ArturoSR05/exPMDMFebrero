package com.example.expmdmfebrero.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.expmdmfebrero.domain.Album

class AlbumDiffUtil: DiffUtil.ItemCallback<Album>() {
    override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem == newItem
    }
}