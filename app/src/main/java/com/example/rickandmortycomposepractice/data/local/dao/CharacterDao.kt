package com.example.rickandmortycomposepractice.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.rickandmortycomposepractice.data.local.entity.CharacterEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CharacterDao {

    @Query("SELECT * FROM character_table")
    fun getAllCharacters(): Flow<List<CharacterEntity>>

    @Query("SELECT * FROM character_table WHERE name LIKE '%' || :characterName || '%'")
    fun getCharactersByName(characterName: String): Flow<List<CharacterEntity>>

    @Query("SELECT * FROM character_table WHERE id = :characterId")
    fun getCharacterById(characterId: Int): Flow<CharacterEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCharacters(characters: List<CharacterEntity>)

    @Query("DELETE FROM character_table")
    suspend fun clearCharacters()
}