package com.example.vocabularyapp.common_ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomToolbar(
    text: String,
    onBackClick: () -> Unit,
    listOfActions: List<ToolbarAction> = listOf()
) {

    Surface(elevation = 4.dp) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            IconButton(onClick = {
                onBackClick()
            }) {
                Icon(
                    imageVector = Icons.Default.ArrowBackIos,
                    contentDescription = ""
                )
            }

            Text(
                text = text,
                textAlign = TextAlign.Center,
                fontSize = 22.sp,
                color = Color(0xFF000000),
                fontWeight = FontWeight.Bold
            )

            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
                Row {
                    listOfActions.forEach { toolbarAction ->
                        IconButton(onClick = {
                            toolbarAction.action()
                        }) {
                            Icon(imageVector = toolbarAction.icon, contentDescription = null)
                        }
                    }
                }
            }
        }
    }
}

data class ToolbarAction(
    val icon: ImageVector,
    val action: () -> Unit
)