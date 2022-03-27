package com.example.vocabularyapp.featureHome.presentation.states

import com.example.vocabularyapp.app.db.category.Category

data class CategoryState(
    val isLoading: Boolean = false,
    var response: List<Category>? = null,
    val error: String = ""
)