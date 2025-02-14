package com.pmdm.expmdmfebrero.feature.presentation.adapter

import com.pmdm.expmdmfebrero.feature.domain.Album
import androidx.recyclerview.widget.DiffUtil

class AlbumDiffUtil : DiffUtil.ItemCallback<Album>() {
    override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem.id == newItem.id
    }
    override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem == newItem
    }
}