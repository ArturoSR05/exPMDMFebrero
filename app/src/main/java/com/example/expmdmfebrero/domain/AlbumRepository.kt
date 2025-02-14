package com.example.expmdmfebrero.domain

interface AlbumRepository {

    fun getAlbums(): List<Album>
}