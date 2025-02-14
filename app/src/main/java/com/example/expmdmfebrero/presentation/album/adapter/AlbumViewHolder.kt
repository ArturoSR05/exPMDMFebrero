package com.example.expmdmfebrero.presentation.album.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.expmdmfebrero.databinding.AlbumItemBinding
import com.example.expmdmfebrero.domain.album.Album

class AlbumViewHolder(private val binding: AlbumItemBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(album: Album) {
        binding.nombre.text = album.nombre
        binding.fechaCreacion.text = album.fecha_creacion
        binding.descripcion.text = album.description
    }

    companion object {
        fun from(parent: ViewGroup): AlbumViewHolder {
            val binding = AlbumItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return AlbumViewHolder(binding)
        }
    }
}