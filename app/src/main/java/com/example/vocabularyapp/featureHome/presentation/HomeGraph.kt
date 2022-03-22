package com.example.vocabularyapp.featureHome.presentation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.vocabularyapp.app.presentation.navigation.AppNavigation
import com.example.vocabularyapp.core.models.entity.internal.Graph
import com.example.vocabularyapp.core.models.entity.internal.Screen
import com.example.vocabularyapp.featureHome.presentation.addWordScreen.AddWordScreen
import com.example.vocabularyapp.featureHome.presentation.categoryDescriptionScreen.CategoryDescriptionScreen
import com.example.vocabularyapp.featureHome.presentation.homeScreen.HomeScreen
import com.example.vocabularyapp.featureHome.presentation.wordDescriptionScreen.WordDescriptionScreen

fun NavGraphBuilder.HomeGraph(
    appNavigation: AppNavigation,
) {
    navigation(
        startDestination = Screen.HomeScreen.route,
        route = Graph.HomeGraph.route
    ) {
        composable(route = Screen.HomeScreen.route) {
            HomeScreen(appNavigation = appNavigation)
        }

        composable(route = Screen.AddWordScreen.route) {
            AddWordScreen(appNavigation = appNavigation)
        }
        composable(route = Screen.CategoryDescriptionScreen.route) {
            CategoryDescriptionScreen(appNavigation = appNavigation)
        }
        composable(route = Screen.WordDescriptionScreen.route) {
            WordDescriptionScreen(appNavigation = appNavigation)
        }
    }
}
