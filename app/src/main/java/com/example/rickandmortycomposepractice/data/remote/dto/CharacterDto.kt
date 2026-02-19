package com.example.rickandmortycomposepractice.data.remote.dto

import com.example.rickandmortycomposepractice.data.local.entity.CharacterEntity
import com.google.gson.annotations.SerializedName

data class CharacterResponseDto(
    @SerializedName("results") val results: List<CharacterDto>
)

data class CharacterDto(
    val id: Int,
    val name: String,
    val status: String,
    val image: String,
    val species: String,
    val gender: String
)

fun CharacterDto.toCharacterEntity(): CharacterEntity {
    return CharacterEntity(
        id = id,
        name = name,
        status = status,
        image = image,
        species = species,
        gender = gender
    )
}