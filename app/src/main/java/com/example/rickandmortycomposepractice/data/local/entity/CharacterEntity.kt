package com.example.rickandmortycomposepractice.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.rickandmortycomposepractice.domain.model.Character

@Entity(tableName = "character_table")
data class CharacterEntity(
    @PrimaryKey val id: Int,
    val name: String,
    val status: String,
    val image: String,
    val species: String,
    val gender: String
)

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