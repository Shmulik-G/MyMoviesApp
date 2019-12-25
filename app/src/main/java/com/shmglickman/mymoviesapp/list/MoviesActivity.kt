package com.shmglickman.mymoviesapp.list

/**
 * Created by:   Shmulik Glickman on 25/12/2019, 22:54.
 * Package Name: com.shmglickman.mymoviesapp.list.
 */

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shmglickman.mymoviesapp.R
import com.shmglickman.mymoviesapp.model.MovieModel
import kotlinx.android.synthetic.main.activity_movies.*

class MoviesActivity : AppCompatActivity(), OnMovieClickListener {

    private val movies: MutableList<MovieModel> = mutableListOf()

    private lateinit var moviesAdapter: MoviesViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)
        loadMovies()
        initRecyclerView()
    }

    private fun initRecyclerView() {
        moviesList.layoutManager = LinearLayoutManager(this@MoviesActivity) as RecyclerView.LayoutManager

        // Create Movies Adapter
        moviesAdapter = MoviesViewAdapter(
            context = this@MoviesActivity,
            movieClickListener = this@MoviesActivity
        )

        // Attach Adapter to RecyclerView
        moviesList.adapter = moviesAdapter

        // Populate Adapter with data
        moviesAdapter.setData(movies)
    }

    override fun onMovieClicked(movie: MovieModel) {
        Toast.makeText(this, movie.name, Toast.LENGTH_SHORT).show()
    }

    private fun loadMovies() {
        movies.add(
            MovieModel(
                "Avengers: Infinity War",
                R.drawable.infinity_war_image,
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain."
            )
        )
        movies.add(
            MovieModel(
                "Jurassic World - Fallen Kingdom",
                R.drawable.jurassic_world_fallen_kingdom,
                "Three years after the demise of Jurassic World, a volcanic eruption threatens the remaining dinosaurs on the isla Nublar, so Claire Dearing, the former park manager, recruits Owen Grady to help prevent the extinction of the dinosaurs once again"
            )
        )
        movies.add(
            MovieModel(
                "The Meg",
                R.drawable.the_meg,
                "A deep sea submersible pilot revisits his past fears in the Mariana Trench, and accidentally unleashes the seventy foot ancestor of the Great White Shark believed to be extinct"
            )
        )
        movies.add(
            MovieModel(
                "The First Purge",
                R.drawable.the_first_purge,
                "To push the crime rate below one percent for the rest of the year, the New Founding Fathers of America test a sociological theory that vents aggression for one night in one isolated community. But when the violence of oppressors meets the rage of the others, the contagion will explode from the trial-city borders and spread across the nation"
            )
        )
        movies.add(
            MovieModel(
                "Deadpool 2",
                R.drawable.deadpool_2,
                "Wisecracking mercenary Deadpool battles the evil and powerful Cable and other bad guys to save a boy's life"
            )
        )
        movies.add(
            MovieModel(
                "Black Panther",
                R.drawable.black_panther,
                "King T'Challa returns home from America to the reclusive, technologically advanced African nation of Wakanda to serve as his country's new leader. However, T'Challa soon finds that he is challenged for the throne by factions within his own country as well as without. Using powers reserved to Wakandan kings, T'Challa assumes the Black Panther mantel to join with girlfriend Nakia, the queen-mother, his princess-kid sister, members of the Dora Milaje (the Wakandan 'special forces') and an American secret agent, to prevent Wakanda from being dragged into a world war"
            )
        )
        movies.add(
            MovieModel(
                "Ocean's Eight",
                R.drawable.ocean_eight,
                "Debbie Ocean, a criminal mastermind, gathers a crew of female thieves to pull off the heist of the century at New York's annual Met Gala"
            )
        )
        movies.add(
            MovieModel(
                "Interstellar",
                R.drawable.interstellar,
                "Interstellar chronicles the adventures of a group of explorers who make use of a newly discovered wormhole to surpass the limitations on human space travel and conquer the vast distances involved in an interstellar voyage"
            )
        )
        movies.add(
            MovieModel(
                "Thor - Ragnarok",
                R.drawable.thor_ragnarok,
                "Thor is on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarok, the prophecy of destruction to his homeworld and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela"
            )
        )
        movies.add(
            MovieModel(
                "Guardians of the Galaxy",
                R.drawable.guardians_of_the_galaxy,
                "Light years from Earth, 26 years after being abducted, Peter Quill finds himself the prime target of a manhunt after discovering an orb wanted by Ronan the Accuser"
            )
        )
    }
}