package com.example.filmlerapp.data.datasource

import com.example.filmlerapp.data.entity.Filmler
import com.example.filmlerapp.room.FilmlerDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FilmlerDataSource(var filmlerDao: FilmlerDao) {

    suspend fun filmleriYukle():List<Filmler> =   // verileri asenkron şekilde alınıp return etmemizi sağladı
        withContext(Dispatchers.IO){   // io veritabanı işlemlerinde , main viewModel işlemlerinde kullanılır

        return@withContext filmlerDao.filmleriYukle()
    }
}