package com.shmglickman.mymoviesapp.list

import com.shmglickman.mymoviesapp.model.MovieModel

interface OnMovieClickListener {
    fun onMovieClicked(movie: MovieModel)
}