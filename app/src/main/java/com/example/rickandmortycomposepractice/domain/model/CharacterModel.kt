package com.example.rickandmortycomposepractice.domain.model

import com.example.rickandmortycomposepractice.data.entity.CharacterEntity
import com.example.rickandmortycomposepractice.data.entity.CharacterResponseEntity
import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    @SerializedName("results") val results: List<Character>
)

data class Character(
    val id: Int,
    val name: String,
    val status: String,
    val image: String,
    val species: String,
    val gender: String
)

fun CharacterResponseEntity.toCharacterResponseDomain(): CharacterResponse {
    return CharacterResponse(
        results = results.map { it.toCharacterDomain() }
    )
}

fun CharacterEntity.toCharacterDomain(): Character {
    return Character(
        id = id,
        name = name,
        status = status,
        image = image,
        species = species,
        gender = gender
    )
}