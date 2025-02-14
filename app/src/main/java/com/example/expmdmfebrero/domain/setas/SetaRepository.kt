package com.example.expmdmfebrero.domain.setas

interface SetaRepository {

    suspend fun getSetasByAlbum(albumId: Int): List<Seta>
}