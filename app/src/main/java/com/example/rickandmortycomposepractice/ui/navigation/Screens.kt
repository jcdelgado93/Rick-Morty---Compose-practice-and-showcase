package com.example.rickandmortycomposepractice.ui.navigation

import kotlinx.serialization.Serializable

@Serializable
object CharacterList

@Serializable
data class CharacterDetail (
    val id: Int
)