package com.pmdm.expmdmfebrero.feature.data.local

import com.pmdm.expmdmfebrero.feature.domain.Album

fun fetchAlbums(): List<Album> {
    return listOf(
        Album(1, "Álbum Setas 1", "2023-01-01", "Colección de setas silvestres", "https://via.placeholder.com/150", false),
        Album(2, "Álbum Setas 2", "2023-01-05", "Setas de temporada", "https://via.placeholder.com/150", false),
        Album(3, "Álbum Setas 3", "2023-01-10", "Setas raras y exóticas", "https://via.placeholder.com/150", false),
        Album(4, "Álbum Setas 4", "2023-01-15", "Setas para identificar", "https://via.placeholder.com/150", false),
        Album(5, "Álbum Setas 5", "2023-01-20", "Setas de diferentes regiones", "https://via.placeholder.com/150", false),
        Album(6, "Álbum Setas 6", "2023-01-25", "Setas de bosque", "https://via.placeholder.com/150", false),
        Album(7, "Álbum Setas 7", "2023-02-01", "Setas del campo", "https://via.placeholder.com/150", false),
        Album(8, "Álbum Setas 8", "2023-02-05", "Setas para principiantes", "https://via.placeholder.com/150", false),
        Album(9, "Álbum Setas 9", "2023-02-10", "Setas medicinales", "https://via.placeholder.com/150", false),
        Album(10, "Álbum Setas 10", "2023-02-15", "Setas de alta montaña", "https://via.placeholder.com/150", false)
    )
}