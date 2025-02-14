package com.example.expmdmfebrero.presentation.setas.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.expmdmfebrero.domain.setas.Seta

class SetasAdapter: ListAdapter<Seta, SetasViewHolder>(SetasDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SetasViewHolder {
        return SetasViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: SetasViewHolder, position: Int) {
        val album = getItem(position)
        holder.bind(album)
    }
}