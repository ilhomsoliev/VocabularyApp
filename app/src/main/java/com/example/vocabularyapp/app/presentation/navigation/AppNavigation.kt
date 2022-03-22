package com.example.vocabularyapp.app.presentation.navigation

import androidx.navigation.NavController

interface AppNavigation {
    fun navigateToAddCategoryScreen()
    fun navigateBack()
    fun navigateToHomeScreen()
    fun navigateToSettingsScreen()
    fun navigateToAddWordScreen()
    fun navigateToWordDescriptionScreen()
    fun navigateToCategoryDescriptionScreen()
}