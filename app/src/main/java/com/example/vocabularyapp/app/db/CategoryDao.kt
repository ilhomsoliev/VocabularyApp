package com.example.vocabularyapp.app.db

import androidx.room.*
import com.example.vocabularyapp.app.db.category.Category
import kotlinx.coroutines.flow.Flow

@Dao
interface CategoryDao {

    @Query("SELECT * FROM category")
    fun getAllVocabularies(): List<Category>

    @Query("DELETE FROM category")
    suspend fun deleteAllVocabularies()

    @Insert
    suspend fun insertVocabulary(category: Category)

    @Delete
    suspend fun deleteVocabulary(category: Category)

    @Update
    suspend fun updateVocabulary(category: Category)

    @Query("SELECT * FROM category WHERE id = :categoryId")
    fun findVocabularyById(categoryId: Int): Flow<Category>
}