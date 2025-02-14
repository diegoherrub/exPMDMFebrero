import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.pmdm.expmdmfebrero.R
import com.pmdm.expmdmfebrero.feature.domain.Album
import com.pmdm.expmdmfebrero.feature.presentation.adapter.AlbumDiffUtil


class AlbumAdapter(
    private val onFavoriteClick: (Int) -> Unit,
    private val onAlbumClick: (Album) -> Unit
) : ListAdapter<Album, AlbumAdapter.AlbumViewHolder>(AlbumDiffUtil()) {

    inner class AlbumViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val ivAlbumImage: ImageView = itemView.findViewById(R.id.ivAlbumImage)
        private val tvAlbumName: TextView = itemView.findViewById(R.id.tvAlbumName)
        private val tvAlbumDate: TextView = itemView.findViewById(R.id.tvAlbumDate)
        private val tvAlbumDescription: TextView = itemView.findViewById(R.id.tvAlbumDescription)
        private val btnFavorite: ImageButton = itemView.findViewById(R.id.btnFavorite)

        fun bind(album: Album) {
            tvAlbumName.text = album.name
            tvAlbumDate.text = album.creationDate
            tvAlbumDescription.text = album.description

            if (album.isFavorite) {
                btnFavorite.setImageResource(R.drawable.baseline_bookmark_24)
            } else {
                btnFavorite.setImageResource(R.drawable.baseline_bookmark_border_24)
            }

            btnFavorite.setOnClickListener {
                onFavoriteClick(album.id)
            }

            itemView.setOnClickListener {
                onAlbumClick(album)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_album_item, parent, false)
        return AlbumViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}