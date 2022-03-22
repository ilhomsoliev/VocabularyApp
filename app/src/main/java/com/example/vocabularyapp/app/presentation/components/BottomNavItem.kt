package com.example.vocabularyapp.app.presentation.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.vocabularyapp.app.presentation.navigation.AppNavigation
import com.example.vocabularyapp.app.presentation.theme.Purple200
import com.example.vocabularyapp.app.presentation.theme.Purple500
import com.example.vocabularyapp.app.presentation.theme.Teal200
import com.example.vocabularyapp.core.models.entity.internal.Screen
import com.example.vocabularyapp.core.models.entity.model.BottomNavDestination

@Composable
fun RowScope.BottomNavItem(
    navController: NavController,
    item: BottomNavDestination
) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigationItem(
        selected = currentDestination?.hierarchy?.any {
            when (item.destinationRoute) {
                Screen.HomeScreen.route -> {
                    it.route == Screen.HomeScreen.route
                }
                Screen.SettingsScreen.route -> {
                    it.route == Screen.SettingsScreen.route
                }
                else -> {
                    it.route == Screen.SettingsScreen.route
                }
            }
        } == true,
        onClick = {
            navigateToScreen(item.destinationRoute, navController)
        },
        icon = {
            Icon(
                modifier = Modifier.size(24.dp),
                imageVector = item.icon,
                contentDescription = "BottomNavIcon"
            )
        },
        label = {
            Text(
                text = item.label,
                fontSize = 10.sp
            )
        },
        selectedContentColor = Teal200,
        unselectedContentColor = Purple500
    )
}

private fun navigateToScreen(route: String, navController: NavController) {
    navController.navigate(route = route) {
        popUpTo(navController.graph.findStartDestination().id) { saveState = true }
        launchSingleTop = true
        restoreState = true
    }
}