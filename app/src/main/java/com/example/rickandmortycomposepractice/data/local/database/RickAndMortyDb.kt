package com.example.rickandmortycomposepractice.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.rickandmortycomposepractice.data.local.dao.CharacterDao
import com.example.rickandmortycomposepractice.data.local.entity.CharacterEntity

@Database(
    entities = [CharacterEntity::class],
    version = 1,
    exportSchema = false
)
abstract class RickAndMortyDb : RoomDatabase() {

    abstract fun characterDao(): CharacterDao
}