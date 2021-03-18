package com.br.natanfc.filmesflix.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.br.natanfc.filmesflix.model.Movie

class MovieListViewModel: ViewModel() {
    private val listOfMovies = arrayListOf<Movie>(
        Movie(0, "Titanic", null, null, null),
        Movie(0, "Central do Brasil", null, null, null)
    )

    private var _moviesList = MutableLiveData<List<Movie>>()
    val moviesList: LiveData<List<Movie>>
    get() = _moviesList

    fun init(){
        getAllMovies()
    }

    private fun getAllMovies(){
        _moviesList.value = listOfMovies
    }
}