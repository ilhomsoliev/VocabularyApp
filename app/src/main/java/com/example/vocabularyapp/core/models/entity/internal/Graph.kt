package com.example.vocabularyapp.core.models.entity.internal

sealed class Graph(val route: String) {
    object HomeGraph:Graph("HomeGraph")
    object SettingsGraph:Graph("SettingsGraph")
}