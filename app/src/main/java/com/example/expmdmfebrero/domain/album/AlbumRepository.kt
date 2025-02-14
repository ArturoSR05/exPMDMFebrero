package com.example.expmdmfebrero.domain.album

interface AlbumRepository {

    fun getAlbums(): List<Album>
}