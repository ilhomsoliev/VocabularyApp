package com.example.vocabularyapp.core.models.entity.internal

sealed class Screen(val route: String) {
    object HomeScreen : Screen(route = "HomeScreen")
    object SettingsScreen : Screen(route = "SettingsScreen")
    object AddWordScreen : Screen(route = "AddWordScreen")
    object WordDescriptionScreen : Screen(route = "WordDescriptionScreen")
    object AddCategoryScreen : Screen(route = "AddCategoryScreen")
    object CategoryDescriptionScreen : Screen(route = "CategoryDescriptionScreen")
}