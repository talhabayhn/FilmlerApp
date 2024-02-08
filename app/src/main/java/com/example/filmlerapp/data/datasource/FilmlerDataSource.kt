package com.example.filmlerapp.data.datasource

import com.example.filmlerapp.data.entity.Filmler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FilmlerDataSource {

    suspend fun filmleriYukle():List<Filmler> =   // verileri asenkron şekilde alınıp return etmemizi sağladı
        withContext(Dispatchers.IO){   // io veritabanı işlemlerinde , main viewModel işlemlerinde kullanılır
        val filmlerListesi = ArrayList<Filmler>()
        val f1 = Filmler(1,"Django","django",24)
        val f2 = Filmler(2,"Interstellar","interstellar",32)
        val f3 = Filmler(3,"Inception","inception",16)
        val f4 = Filmler(4,"The Hateful Eight","thehatefuleight",28)
        val f5 = Filmler(5,"The Pianist","thepianist",18)
        val f6 = Filmler(6,"Anadoluda","anadoluda",10)
        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)
        filmlerListesi.add(f5)
        filmlerListesi.add(f6)

        return@withContext filmlerListesi
    }
}