import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pmdm.expmdmfebrero.feature.domain.Album
import com.pmdm.expmdmfebrero.feature.domain.GetAlbumsUseCase
import com.pmdm.expmdmfebrero.feature.domain.ToggleFavoriteUseCase
import kotlinx.coroutines.launch

class AlbumViewModel(
    private val getAlbumsUseCase: GetAlbumsUseCase,
    private val toggleFavoriteUseCase: ToggleFavoriteUseCase
) : ViewModel() {

    private val _state = MutableLiveData<UIState>()
    val uiState: LiveData<UIState> = _state

    init {
        loadAlbums()
    }

    fun loadAlbums() {
        viewModelScope.launch {
            _state.value = UIState.Loading
            try {
                val albums = getAlbumsUseCase()
                _state.value = UIState.Success(albums)
            } catch (e: Exception) {
                _state.value = UIState.Error("Error al cargar álbumes")
            }
        }
    }

    fun toggleFavorite(albumId: Int) {
        viewModelScope.launch {
            try {
                toggleFavoriteUseCase(albumId)
                loadAlbums()
            } catch (e: Exception) {
            }
        }
    }
}

sealed class UIState {
    object Loading : UIState()
    data class Success(val data: List<Album>) : UIState()
    data class Error(val message: String) : UIState()
}