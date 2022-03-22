package com.example.vocabularyapp.featureSettings.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SettingsSection(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    onClick: () -> Unit
) {
    Column(modifier = modifier
        .padding(6.dp)
        .clickable {
            onClick()
        }
    ) {
        Text(text = title, color = Color.Black)

        Text(text = description, fontSize = 12.sp, color = Color.Gray)

    }
}
