package com.example.vocabularyapp.common_ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun CustomTextField(
    modifier: Modifier = Modifier,
    hint: String,
    currentText: String,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    fontSize: TextUnit = 16.sp,
    onValueChange: (String) -> Unit,
) {
    TextField(
        modifier = modifier
            .fillMaxWidth(),
        keyboardOptions = keyboardOptions,
        value = currentText,
        onValueChange = {
            onValueChange(it)
        },
        textStyle = LocalTextStyle.current.copy(
            fontSize = fontSize
        ),
        placeholder = {
            Text(text = hint, fontSize = fontSize)
        },
        trailingIcon = {
            if (currentText.isNotEmpty()) {
                Icon(
                    modifier = Modifier.clickable {
                        onValueChange("")
                    },
                    imageVector = Icons.Filled.Cancel, contentDescription = "", tint = Color.Blue
                )
            }
        },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.Transparent,
        )
    )
}