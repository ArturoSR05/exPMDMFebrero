package com.example.expmdmfebrero.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.expmdmfebrero.R
import com.example.expmdmfebrero.data.AlbumDataRepository
import com.example.expmdmfebrero.domain.GetAlbumsUseCase
import com.example.expmdmfebrero.presentation.adapter.AlbumAdapter

class AlbumListFragment: Fragment(R.layout.fragment_list_album) {

    private lateinit var viewModel: AlbumViewModel
    private lateinit var adapter: AlbumAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewAlbums)
        recyclerView.layoutManager = LinearLayoutManager(context)

        adapter = AlbumAdapter()
        recyclerView.adapter = adapter

        val repository = AlbumDataRepository()
        val getAlbumsUseCase = GetAlbumsUseCase(repository)
        viewModel = ViewModelProvider(
            this
        ).get(AlbumViewModel::class.java)

        viewModel.binding.observe(viewLifecycleOwner, Observer { albums ->
            adapter.submitList(albums)
        })
    }
}