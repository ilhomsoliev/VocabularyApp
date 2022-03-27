package com.example.vocabularyapp.app.di

import android.content.Context
import androidx.navigation.NavController
import androidx.room.Room
import com.example.vocabularyapp.app.db.CategoryDao
import com.example.vocabularyapp.app.db.CategoryDatabase
import com.example.vocabularyapp.app.presentation.navigation.AppNavigation
import com.example.vocabularyapp.app.presentation.navigation.AppNavigationImpl
import com.example.vocabularyapp.featureHome.data.repository.CategoryRepositoryImpl
import com.example.vocabularyapp.featureHome.domain.repository.CategoryRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNavigation(navController: NavController): AppNavigation =
        AppNavigationImpl(navController)

    @Provides
    @Singleton
    fun provideCategoryDatabase(
        @ApplicationContext context: Context
    ): CategoryDatabase = Room.databaseBuilder(
        context,
        CategoryDatabase::class.java,
        "category_database"
    ).build()

    @Provides
    @Singleton
    fun provideCategoryDao(
        database: CategoryDatabase
    ): CategoryDao = database.getCategoryDao()

    @Provides
    @Singleton
    fun provideCategoryRepository(
        dao:CategoryDao
    ):CategoryRepository = CategoryRepositoryImpl(dao)
}