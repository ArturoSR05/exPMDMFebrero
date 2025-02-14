package com.example.expmdmfebrero.domain.setas

class GetSetasUseCase(private val setaRepository: SetaRepository) {

    suspend fun invoke(albumId: Int): List<Seta> {
        return setaRepository.getSetasByAlbum(albumId)
    }
}