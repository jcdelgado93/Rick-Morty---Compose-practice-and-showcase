package com.example.rickandmortycomposepractice.data.network

import com.example.rickandmortycomposepractice.data.entity.CharacterEntity
import com.example.rickandmortycomposepractice.data.entity.CharacterResponseEntity
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RickAndMortyApi {

    @GET("character")
    suspend fun getCharacters(
        @Query("name") name: String
    ): CharacterResponseEntity

    @GET("character/{id}")
    suspend fun getCharacter(
        @Path("id") id: Int
    ): CharacterEntity
}