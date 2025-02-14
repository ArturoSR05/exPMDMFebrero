package com.example.expmdmfebrero.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.expmdmfebrero.domain.Album
import com.example.expmdmfebrero.domain.GetAlbumsUseCase

class AlbumViewModel(private val getAlbumsUseCase: GetAlbumsUseCase): ViewModel() {

    private val _binding = MutableLiveData<List<Album>>()
    val binding: LiveData<List<Album>> get() = _binding

    init {
        loadAlbums()
    }

    private fun loadAlbums() {
        _binding.value = getAlbumsUseCase.invoke()
    }
}