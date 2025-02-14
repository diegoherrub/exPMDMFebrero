package com.pmdm.expmdmfebrero.feature.domain

interface AlbumRepository {
    suspend fun fetchAlbums(): List<Album>
    suspend fun toggleFavorite(albumId: Int)
    suspend fun isFavorite(albumId: Int): Boolean
}