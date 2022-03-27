package com.example.vocabularyapp.app.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.vocabularyapp.app.db.category.Category

@Database(entities = [Category::class], version = 1)
abstract class CategoryDatabase() : RoomDatabase() {

    abstract fun getCategoryDao(): CategoryDao

}