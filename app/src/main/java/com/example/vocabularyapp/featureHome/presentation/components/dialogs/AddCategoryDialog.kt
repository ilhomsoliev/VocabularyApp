package com.example.vocabularyapp.featureHome.presentation.components.dialogs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.vocabularyapp.common_ui.components.CustomTextField

@Composable
fun AddCategoryDialog(
    title: String,
    isDialogOpen: Boolean,
    onDismissRequest: () -> Unit,
    onCancelButtonClick: () -> Unit,
    onSaveButtonClick: (String) -> Unit
) {
    var textState by remember { mutableStateOf("") }

    if (isDialogOpen) {
        Dialog(onDismissRequest = { onDismissRequest() }) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.White)
            ) {
                Spacer(modifier = Modifier.height(16.dp))

                CustomTextField(hint = "In English", currentText = textState, onValueChange = {
                    textState = it
                })

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 18.dp)
                ) {

                    Button(modifier = Modifier
                        .weight(1f),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color(0xFF4B4B4B),
                            contentColor = Color.White
                        ),
                        onClick = {
                            onCancelButtonClick()
                        }) {
                        Text(text = "Cancel", color = Color.White)
                    }

                    Spacer(modifier = Modifier.width(28.dp))

                    Button(modifier = Modifier
                        .weight(1f),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color(0xFFFF6700),
                            contentColor = Color.White
                        ),
                        onClick = {
                            onSaveButtonClick(textState)
                        }) {
                        Text(text = "Ok", color = Color.White)
                    }
                }
                Spacer(modifier = Modifier.height(26.dp))
            }
        }
    }
}