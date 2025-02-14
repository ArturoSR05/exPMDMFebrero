package com.example.expmdmfebrero.domain

class GetAlbumsUseCase(private val repository: AlbumRepository) {

    operator fun invoke(): List<Album> {
        return repository.getAlbums()
    }

}