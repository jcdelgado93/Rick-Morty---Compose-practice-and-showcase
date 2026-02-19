package com.example.rickandmortycomposepractice.presentation.state

import com.example.rickandmortycomposepractice.domain.model.Character

data class CharactersUiState(
    val characters: List<Character> = emptyList(),
    val isLoading: Boolean = false,
    val searchTerm: String = "",
    val isGridView: Boolean = false,
    val selectedCharacter: Character? = null
)
