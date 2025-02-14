package com.example.expmdmfebrero.presentation.album

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.expmdmfebrero.domain.album.Album
import com.example.expmdmfebrero.domain.album.GetAlbumsUseCase

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