package com.example.vocabularyapp.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Vocabulary::class],version = 1)
abstract class VocabularyDatabase:RoomDatabase(){
    abstract fun getVocabularyDao():VocabularyDao

}