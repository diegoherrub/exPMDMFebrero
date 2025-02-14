package com.pmdm.expmdmfebrero.feature.domain


data class Album(
    val id: Int,
    val name: String,
    val creationDate: String,
    val description: String,
    val imageUrl: String,
    val isFavorite: Boolean
)