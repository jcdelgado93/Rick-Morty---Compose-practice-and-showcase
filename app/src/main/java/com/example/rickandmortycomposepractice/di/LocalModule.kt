package com.example.rickandmortycomposepractice.di

import android.content.Context
import androidx.room.Room
import com.example.rickandmortycomposepractice.data.local.dao.CharacterDao
import com.example.rickandmortycomposepractice.data.local.database.RickAndMortyDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): RickAndMortyDb {
        return Room.databaseBuilder(
            context,
            RickAndMortyDb::class.java,
            "rick_and_morty_database"
        ).build()
    }

    @Provides
    @Singleton
    fun provideCharacterDao(database: RickAndMortyDb): CharacterDao {
        return database.characterDao()
    }
}