package com.example.expmdmfebrero.presentation.setas.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.expmdmfebrero.domain.setas.Seta

class SetasDiffUtil: DiffUtil.ItemCallback<Seta>() {

    override fun areItemsTheSame(oldItem: Seta, newItem: Seta): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Seta, newItem: Seta): Boolean {
        return oldItem == newItem
    }
}