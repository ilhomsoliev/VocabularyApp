package com.example.vocabularyapp.featureSettings.presentation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.vocabularyapp.app.presentation.navigation.AppNavigation
import com.example.vocabularyapp.core.models.entity.internal.Graph
import com.example.vocabularyapp.core.models.entity.internal.Screen
import com.example.vocabularyapp.featureSettings.presentation.settingsScreen.SettingsScreen

fun NavGraphBuilder.SettingsGraph(
    appNavigation: AppNavigation,
) {
    navigation(
        startDestination = Screen.SettingsScreen.route,
        route = Graph.SettingsGraph.route
    ) {
        composable(route = Screen.SettingsScreen.route) {
            SettingsScreen(appNavigation = appNavigation)
        }
    }
}
