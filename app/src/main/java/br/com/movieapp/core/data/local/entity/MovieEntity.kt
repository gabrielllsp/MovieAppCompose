package br.com.movieapp.core.data.local.entity

import androidx.room.Entity

@Entity(tableName = "Movies")
data class MovieEntity(
    val movieId: Int,
    val title: String,
    val imageUrl: String
)
