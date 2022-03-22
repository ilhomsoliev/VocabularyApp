package com.example.vocabularyapp.featureHome.presentation.addWordScreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.vocabularyapp.common_ui.components.CustomTextField

@Composable
fun WordBlankItem() {
    var textEnglishState by remember {
        mutableStateOf("")
    }

    var textRussianState by remember {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFF404549))
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .border(1.dp, Color.Gray, RoundedCornerShape(1200.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        modifier = Modifier.padding(8.dp),//.border(1.dp, Color.Gray, RoundedCornerShape(120.dp)),
                        text = "1"
                    )
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Cancel, contentDescription = null)
                }
            }
            CustomTextField(
                hint = "in englsih",
                currentText = textEnglishState,
                onValueChange = { textEnglishState = it })

            Spacer(modifier = Modifier.height(12.dp))

            CustomTextField(
                hint = "in englsih",
                currentText = textEnglishState,
                onValueChange = { textEnglishState = it })

            Spacer(modifier = Modifier.height(12.dp))

        }
    }
}