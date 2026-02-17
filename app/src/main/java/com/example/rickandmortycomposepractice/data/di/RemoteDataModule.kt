package com.example.rickandmortycomposepractice.data.di

import com.example.rickandmortycomposepractice.data.network.RickAndMortyApi
import com.example.rickandmortycomposepractice.data.repository.CharacterRepositoryImpl
import com.example.rickandmortycomposepractice.domain.repository.CharacterRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {

    @Singleton
    @Provides
    fun provideCharacterRepository(api : RickAndMortyApi): CharacterRepository {
        return CharacterRepositoryImpl(api)
    }
}