package com.example.rickandmortycomposepractice.ui.state

import com.example.rickandmortycomposepractice.domain.model.Character

data class CharacterDetailUiState(
    val character: Character? = null,
    val isLoading: Boolean = true,
    val error: String? = null
)