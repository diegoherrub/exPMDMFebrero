package com.pmdm.expmdmfebrero.feature.domain

class ToggleFavoriteUseCase(private val repository: AlbumRepository) {
    suspend operator fun invoke(albumId: Int) = repository.toggleFavorite(albumId)
}
