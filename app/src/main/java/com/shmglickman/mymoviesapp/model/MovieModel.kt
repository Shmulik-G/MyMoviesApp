package com.shmglickman.mymoviesapp.model

/**
 * Created by:   Shmulik Glickman on 24/12/2019, 16:20.
 * Package Name: com.shmglickman.mymoviesapp.model.
 */

import androidx.annotation.DrawableRes

data class MovieModel(
    val name: String,
    @DrawableRes val imageRes: Int,
    val overview: String?
)