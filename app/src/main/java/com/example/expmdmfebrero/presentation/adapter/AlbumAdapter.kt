package com.example.expmdmfebrero.presentation.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter

import com.example.expmdmfebrero.domain.Album

class AlbumAdapter: ListAdapter<Album, AlbumViewHolder>(AlbumDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        return AlbumViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val album = getItem(position)
        holder.bind(album)
    }
}