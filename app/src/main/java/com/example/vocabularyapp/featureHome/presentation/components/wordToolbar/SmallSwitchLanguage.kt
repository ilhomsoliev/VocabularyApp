package com.example.vocabularyapp.featureHome.presentation.components.wordToolbar

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.runtime.Composable

@Composable
fun SmallSwitchLanguage() {
    Row {
        Text(text = "RU")
        Icon(imageVector = Icons.Default.ChevronRight, contentDescription = null)
        Text(text = "EN")
    }
}