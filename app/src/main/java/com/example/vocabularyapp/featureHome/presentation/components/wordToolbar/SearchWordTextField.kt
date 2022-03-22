package com.example.vocabularyapp.featureHome.presentation.components.wordToolbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SearchWordTextField(modifier: Modifier) {
    var text by remember { mutableStateOf("") }
    Box(modifier = modifier
        .clip(RoundedCornerShape(12.dp))
        .background(Color(0xFF444A4D))) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(6.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            BasicTextField(value = text, onValueChange = { text = it }
            )

            Text(text = "19", fontSize = 14.sp, color = Color.Gray)
        }
    }
}