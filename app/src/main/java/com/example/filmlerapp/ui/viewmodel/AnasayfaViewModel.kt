package com.example.filmlerapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.filmlerapp.data.entity.Filmler
import com.example.filmlerapp.data.repo.FilmlerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnasayfaViewModel @Inject constructor(var frepo:FilmlerRepository): ViewModel() {
    //var frepo = FilmlerRepository()
    var filmlerListesi = MutableLiveData<List<Filmler>>()  // viewmodelden fragment'a veri taşımak için livedata gerekli

    init {
        filmleriYukle() // uygulama ilk açıldığı anda filmleri getir
    }

    fun filmleriYukle(){
        CoroutineScope(Dispatchers.Main).launch{ // arayüzde yakın olduğu için Main

            filmlerListesi.value = frepo.filmleriYukle()
        }

    }
}