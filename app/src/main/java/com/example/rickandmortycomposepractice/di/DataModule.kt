package com.example.rickandmortycomposepractice.di

import com.example.rickandmortycomposepractice.data.local.dao.CharacterDao
import com.example.rickandmortycomposepractice.data.remote.api.RickAndMortyApi
import com.example.rickandmortycomposepractice.data.repository.CharacterRepositoryImpl
import com.example.rickandmortycomposepractice.domain.repository.CharacterRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Singleton
    @Provides
    fun provideCharacterRepository(dao: CharacterDao, api: RickAndMortyApi): CharacterRepository {
        return CharacterRepositoryImpl(dao, api)
    }
}