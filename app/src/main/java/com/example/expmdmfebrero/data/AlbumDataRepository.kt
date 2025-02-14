package com.example.expmdmfebrero.data

import com.example.expmdmfebrero.domain.album.Album
import com.example.expmdmfebrero.domain.album.AlbumRepository

class AlbumDataRepository: AlbumRepository {

    override fun getAlbums(): List<Album> {
        return listOf(
            Album(1,"Album de otoño", "12/01/2025", "Album con setas de otoño", "https://example.com/setas-otono.jpg"),
            Album(2,"Setas comestibles", "23/12/2024", "Album con las setas comestibles", "https://example.com/setas-comestibles.jpg"),
            Album(3,"Setas Venenosas", "2021-05-10", "Album de setas venenosas", "https://example.com/setas-venenosas.jpg"),
            Album(4,"Hongos Medicinales", "2020-11-30", "Album de setas medicinales", "https://example.com/hongos-medicinales.jpg"),
            Album(5,"Setas Exóticas", "2023-01-25", "Album de setas exoticas", "https://example.com/setas-exoticas.jpg"),
            Album( 6,"Setas Luminosas", "2022-12-05", "Album de setas luminosas", "https://example.com/setas-luminosas.jpg"),
            Album( 7,"Setas Gigantes","2021-08-18","Album con las setas mas grandes del mundo","https://example.com/setas-gigantes.jpg"),
            Album(8,"Setas Microscópicas", "2019-03-14", "Album con las setas mas pequeñas del mundo", "https://example.com/setas-microscopicas.jpg"),
            Album(9,"Setas en la Cocina", "2020-06-22", "Album con las setas utilizadas en gastronomía", "https://example.com/setas-cocina.jpg"),
            Album(10,"Setas en la Cultura", "2018-10-05", "Album con setas que han tenido importancia en la cultura", "https://example.com/setas-cultura.jpg")
        )
    }
}