package com.example.vocabularyapp.featureHome.data.repository

import com.example.vocabularyapp.app.db.CategoryDao
import com.example.vocabularyapp.app.db.category.Category
import com.example.vocabularyapp.featureHome.domain.repository.CategoryRepository
import kotlinx.coroutines.flow.Flow

class CategoryRepositoryImpl(
    private val dao: CategoryDao
) : CategoryRepository {
    override suspend fun getCategories(): List<Category> = dao.getAllVocabularies()

    override suspend fun getCategoryById(id: Int): Flow<Category> = dao.findVocabularyById(id)

    override suspend fun insertCategory(category: Category) =
        dao.insertVocabulary(category = category)

    override suspend fun deleteCategory(category: Category) =
        dao.deleteVocabulary(category = category)
}