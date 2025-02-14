package com.example.expmdmfebrero.domain.setas

class GetSetasUseCase(private val repository: SetaRepository) {

    suspend operator fun invoke(albumId: Int): List<Seta> {
        return repository.getSetasByAlbum(albumId)
    }
}