package com.example.expmdmfebrero.presentation.setas

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.expmdmfebrero.R
import com.example.expmdmfebrero.presentation.setas.adapter.SetasAdapter
import kotlin.properties.Delegates

class SetaListFragment: Fragment(R.layout.fragment_list_setas) {

    private lateinit var viewModel: SetasViewModel
    private lateinit var adapter: SetasAdapter
    private var albumId by Delegates.notNull<Int>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        albumId = arguments?.getInt("ALBUM_ID") ?: 0

        adapter = SetasAdapter()
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view_setas)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        viewModel = ViewModelProvider(this).get(SetasViewModel::class.java)

        viewModel.loadSetas(albumId)

        viewModel.binding.observe(viewLifecycleOwner, Observer { setas ->
            adapter.submitList(setas)
        })
    }
}