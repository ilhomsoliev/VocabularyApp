package com.example.vocabularyapp.featureHome.presentation.components.categoryItem

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FileCopy
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CategoryItem(onClick: () -> Unit) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .clickable {
            onClick()
        }) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "99 words", fontSize = 14.sp)
                    Icon(
                        modifier = Modifier.size(12.dp),
                        imageVector = Icons.Default.FileCopy,
                        contentDescription = null
                    )
                }
                Text(text = "Some name of category")
            }
            PlayIcon()
        }
        Divider()
    }
}