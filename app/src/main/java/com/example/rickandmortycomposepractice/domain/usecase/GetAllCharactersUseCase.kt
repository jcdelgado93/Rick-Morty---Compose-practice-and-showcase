package com.example.rickandmortycomposepractice.domain.usecase

import com.example.rickandmortycomposepractice.domain.repository.CharacterRepository
import javax.inject.Inject

class GetAllCharactersUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    operator fun invoke() = repository.getAllCharacters()
}