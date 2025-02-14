package com.pmdm.expmdmfebrero.feature.data.local

import com.pmdm.expmdmfebrero.feature.domain.Mushroom

fun getMushroomMock(): List<Mushroom> {
    return listOf(
        Mushroom(1, "Amanita muscaria", "https://via.placeholder.com/150"),
        Mushroom(2, "Morel", "https://via.placeholder.com/150"),
        Mushroom(3, "Champiñón", "https://via.placeholder.com/150"),
        Mushroom(4, "Shiitake", "https://via.placeholder.com/150"),
        Mushroom(5, "Ostra", "https://via.placeholder.com/150"),
        Mushroom(6, "Portobello", "https://via.placeholder.com/150")
    )
}