package com.pmdm.expmdmfebrero.feature.domain

class GetAlbumsUseCase(private val repository: AlbumRepository) {
    suspend operator fun invoke(): List<Album> = repository.fetchAlbums()
}