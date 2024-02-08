package com.example.filmlerapp.data.repo

import com.example.filmlerapp.data.datasource.FilmlerDataSource
import com.example.filmlerapp.data.entity.Filmler

class FilmlerRepository(var fds:FilmlerDataSource) {

    //var fds = FilmlerDataSource()  // dagger hilt

    suspend fun filmleriYukle():List<Filmler> = fds.filmleriYukle()



}