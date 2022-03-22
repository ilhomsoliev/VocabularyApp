package com.example.vocabularyapp.featureHome.presentation.components.categoryItem

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun PlayIcon() {
    Box(
        modifier = Modifier
            .padding(4.dp)
            .border(3.dp, Color(0xFF798D62), RoundedCornerShape(20.dp))
    ) {
        Row(
            modifier = Modifier.padding(4.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                modifier = Modifier.padding(2.dp).size(32.dp),
                imageVector = Icons.Default.PlayArrow,
                contentDescription = null
            )

            Text(modifier = Modifier.padding(2.dp), text = "0%")
        }
    }
}