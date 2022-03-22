package com.example.vocabularyapp.app.presentation.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.vocabularyapp.app.presentation.components.VocabularyBottomBar
import com.example.vocabularyapp.core.models.entity.internal.Graph
import com.example.vocabularyapp.featureHome.presentation.HomeGraph
import com.example.vocabularyapp.featureSettings.presentation.SettingsGraph

@Composable
fun Navigation() {

    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    Scaffold(
        /*topBar = {

        },*/
        bottomBar = {
            //if (currentDestination?.isCurrentDestinationHasBottomSheet() == true) {
            VocabularyBottomBar(navController = navController)
            //}
        }
    ) {
        NavHost(
            modifier = Modifier.padding(it),
            navController = navController,
            startDestination = Graph.HomeGraph.route,
        ) {
            val navigation = AppNavigationImpl(navController)
            HomeGraph(appNavigation = navigation)
            SettingsGraph(appNavigation = navigation)
        }
    }
}
