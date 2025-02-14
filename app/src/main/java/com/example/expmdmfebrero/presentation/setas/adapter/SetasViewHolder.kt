package com.example.expmdmfebrero.presentation.setas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.expmdmfebrero.databinding.SetaItemBinding
import com.example.expmdmfebrero.domain.setas.Seta

class SetasViewHolder(private val binding: SetaItemBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(seta: Seta) {
        binding.nombre.text = seta.nombre
    }

    companion object {
        fun from(parent: ViewGroup): SetasViewHolder {
            val binding = SetaItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return SetasViewHolder(binding)
        }
    }
}