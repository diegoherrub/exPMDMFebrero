package com.pmdm.expmdmfebrero

import AlbumAdapter
import AlbumViewModel
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pmdm.expmdmfebrero.feature.data.AlbumDataRepository
import com.pmdm.expmdmfebrero.feature.domain.Album
import com.pmdm.expmdmfebrero.feature.domain.AlbumRepository
import com.pmdm.expmdmfebrero.feature.domain.GetAlbumsUseCase
import com.pmdm.expmdmfebrero.feature.domain.ToggleFavoriteUseCase

//import appModule
//import org.koin.android.ext.koin.androidContext
//import org.koin.androidx.viewmodel.ext.android.viewModel
//import org.koin.core.context.startKoin


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: AlbumViewModel// by viewModel()
    private lateinit var adapter: AlbumAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
}