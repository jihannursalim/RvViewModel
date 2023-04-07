package com.example.rvviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FilmViewModel : ViewModel(){
    var list = arrayListOf(
        DataFilm(R.drawable.dilan, "Dilan 1990", "01/04/2023"),
        DataFilm(R.drawable.habibi, "Habibi & Ainun", "02/04/2023"),
        DataFilm(R.drawable.img, "99 Cahaya di Langit Eropa", "03/04/2023"),
        DataFilm(R.drawable.img_1, "Filosofi Kopi", "04/04/2023"),
        DataFilm(R.drawable.img_2, "Ayla", "05/04/2023"),
        DataFilm(R.drawable.img_3, "Katla", "06/04/2023"),
    )

    val filmList : MutableLiveData<List<DataFilm>> = MutableLiveData()

    fun getFilmList(){
        filmList.value = list
    }
}