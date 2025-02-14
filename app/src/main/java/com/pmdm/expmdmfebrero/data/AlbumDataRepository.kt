package com.pmdm.expmdmfebrero.data

import com.pmdm.expmdmfebrero.domain.Album
import com.pmdm.expmdmfebrero.domain.AlbumRepository

class AlbumDataRepository(
    private val mockDataSource: AlbumRepository
) : AlbumRepository {
    override suspend fun fetchAlbums(): List<Album> {

        return mockDataSource.fetchAlbums().map { remoteAlbum ->
            Album(
                id = remoteAlbum.id,
                name = remoteAlbum.name,
                creationDate = remoteAlbum.creationDate,
                description = remoteAlbum.description,
                imageUrl = remoteAlbum.imageUrl,
                isFavorite = mockDataSource.isFavorite(remoteAlbum.id)
            )
        }
    }

    override suspend fun toggleFavorite(albumId: Int) {
        mockDataSource.toggleFavorite(albumId)
    }

    override suspend fun isFavorite(albumId: Int): Boolean {
        return mockDataSource.isFavorite(albumId)
    }
}