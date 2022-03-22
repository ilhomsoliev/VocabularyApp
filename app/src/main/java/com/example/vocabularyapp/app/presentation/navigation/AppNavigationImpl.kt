package com.example.vocabularyapp.app.presentation.navigation

import androidx.navigation.NavController
import com.example.vocabularyapp.core.models.entity.internal.Screen

class AppNavigationImpl(private val navController: NavController) : AppNavigation {
    override fun navigateToAddCategoryScreen() {
        navController.navigate(Screen.AddCategoryScreen.route)
    }

    override fun navigateBack() {
        navController.popBackStack()
    }

    override fun navigateToHomeScreen() {
        navController.navigate(Screen.HomeScreen.route)
    }

    override fun navigateToSettingsScreen() {
        navController.navigate(Screen.SettingsScreen.route)

    }

    override fun navigateToAddWordScreen() {
        navController.navigate(Screen.AddWordScreen.route)
    }

    override fun navigateToWordDescriptionScreen() {
        navController.navigate(Screen.WordDescriptionScreen.route)
    }

    override fun navigateToCategoryDescriptionScreen() {
        navController.navigate(Screen.CategoryDescriptionScreen.route)

    }
}