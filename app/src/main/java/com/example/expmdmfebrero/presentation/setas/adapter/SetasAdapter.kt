package com.example.expmdmfebrero.presentation.setas.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.expmdmfebrero.domain.album.Album
import com.example.expmdmfebrero.domain.setas.Seta
import com.example.expmdmfebrero.presentation.album.adapter.AlbumDiffUtil
import com.example.expmdmfebrero.presentation.album.adapter.AlbumViewHolder

class SetasAdapter : ListAdapter<Seta, SetasViewHolder>(SetasDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SetasViewHolder {
        return SetasViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: SetasViewHolder, position: Int) {
        val seta = getItem(position)
        holder.bind(seta)
    }
}