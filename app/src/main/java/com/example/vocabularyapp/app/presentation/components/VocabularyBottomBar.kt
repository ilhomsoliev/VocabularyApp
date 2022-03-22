package com.example.vocabularyapp.app.presentation.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.navigation.NavController
import com.example.vocabularyapp.app.presentation.theme.Purple200
import com.example.vocabularyapp.core.models.entity.internal.Screen
import com.example.vocabularyapp.core.models.entity.model.BottomNavDestination

@Composable
fun VocabularyBottomBar(navController: NavController) {
    BottomNavigation(
        backgroundColor = White.copy(alpha = 0.95F),
        contentColor = Purple200
    ) {

        bottomNavDestinations.forEach { navItem ->
            BottomNavItem(navController = navController, item = navItem)
        }

    }
}

val bottomNavDestinations = listOf(
    BottomNavDestination(
        label = "Home",
        destinationRoute = Screen.HomeScreen.route,
        icon = Icons.Default.Home
    ),
    BottomNavDestination(
        label = "Settings",
        destinationRoute = Screen.SettingsScreen.route,
        icon = Icons.Default.Settings
    ),
)