package com.example.vocabularyapp.app.di

import androidx.navigation.NavController
import com.example.vocabularyapp.app.presentation.navigation.AppNavigation
import com.example.vocabularyapp.app.presentation.navigation.AppNavigationImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNavigation(navController: NavController): AppNavigation = AppNavigationImpl(navController)
}