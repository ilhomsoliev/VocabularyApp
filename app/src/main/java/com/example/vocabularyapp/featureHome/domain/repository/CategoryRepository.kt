package com.example.vocabularyapp.featureHome.domain.repository

import com.example.vocabularyapp.app.db.category.Category
import kotlinx.coroutines.flow.Flow


interface CategoryRepository {

    fun getCategories(): List<Category>

    suspend fun getCategoryById(id: Int): Flow<Category>

    suspend fun insertCategory(category: Category)

    suspend fun deleteCategory(category: Category)
}