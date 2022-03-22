package com.example.vocabularyapp.featureHome.presentation.components.categoryToolbar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SwitchLanguage() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Row(modifier = Modifier.clickable {

        }, verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Russian")
            Icon(imageVector = Icons.Default.ExpandMore, contentDescription = null)
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.Home, contentDescription = null)
        }
        Row(modifier = Modifier.clickable {

        }, verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Russian")
            Icon(imageVector = Icons.Default.ExpandMore, contentDescription = null)
        }
    }
}