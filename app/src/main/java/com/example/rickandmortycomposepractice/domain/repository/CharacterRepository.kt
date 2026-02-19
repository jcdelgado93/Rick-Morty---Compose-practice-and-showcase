package com.example.rickandmortycomposepractice.domain.repository

import com.example.rickandmortycomposepractice.domain.model.Character
import com.example.rickandmortycomposepractice.domain.model.CharacterResponse
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {
    fun getAllCharacters(): Flow<CharacterResponse>
    fun getCharactersByName(name: String): Flow<CharacterResponse>
    fun getCharacterById(id: Int): Flow<Character?>
}