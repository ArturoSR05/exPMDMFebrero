package com.example.expmdmfebrero.presentation.setas

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.expmdmfebrero.domain.setas.GetSetasUseCase
import com.example.expmdmfebrero.domain.setas.Seta
import kotlinx.coroutines.launch

class SetaViewModel (private val getSetasUseCase: GetSetasUseCase) : ViewModel() {

    private val _binding = MutableLiveData<List<Seta>>()
    val binding: LiveData<List<Seta>> = _binding

    fun loadSetas(albumId: Int) {
        viewModelScope.launch {
            val setas = getSetasUseCase.invoke(albumId)
            _binding.postValue(setas)
        }
    }
}