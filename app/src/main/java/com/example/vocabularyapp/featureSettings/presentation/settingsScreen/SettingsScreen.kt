package com.example.vocabularyapp.featureSettings.presentation.settingsScreen

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.vocabularyapp.app.presentation.navigation.AppNavigation
import com.example.vocabularyapp.featureSettings.presentation.components.SettingsSection

@Composable
fun SettingsScreen(appNavigation: AppNavigation) {
    val verticalScroll = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .horizontalScroll(verticalScroll)
    ) {
        SettingsSection(
            modifier = Modifier.fillMaxWidth(),
            title = "Native Language",
            description = "Russian"
        ) {

        }
        SettingsSection(title = "App Theme", description = "Light") {

        }
    }
}