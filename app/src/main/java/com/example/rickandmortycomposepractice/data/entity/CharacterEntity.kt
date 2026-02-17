package com.example.rickandmortycomposepractice.data.entity

import com.google.gson.annotations.SerializedName

data class CharacterResponseEntity(
    @SerializedName("results") val results: List<CharacterEntity>
)

data class CharacterEntity(
    val id: Int,
    val name: String,
    val status: String,
    val image: String,
    val species: String,
    val gender: String
)