package com.example.vocabularyapp.db

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface VocabularyDao {

    @Query("SELECT * FROM vocabulary")
    fun getAllVocabularies(): Flow<List<Vocabulary>>

    /*@Query("SELECT * FROM notes WHERE title LIKE '%' || :titleParam || '%' ")
    fun searchQuery(titleParam: String): Flow<List<Vocabulary>>*/

    @Query("DELETE FROM vocabulary")
    suspend fun deleteAllVocabularies()

    @Insert
    suspend fun insertVocabulary(vocabulary: Vocabulary)

    @Delete
    suspend fun deleteVocabulary(vocabulary: Vocabulary)

    @Update
    suspend fun updateVocabulary(vocabulary: Vocabulary)

    @Query("SELECT * FROM vocabulary WHERE id = :vocabularyId")
    fun findVocabularyById(vocabularyId: Int): Flow<Vocabulary>
}