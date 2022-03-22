package com.example.vocabularyapp.featureHome.presentation.addWordScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.vocabularyapp.app.presentation.navigation.AppNavigation
import com.example.vocabularyapp.common_ui.components.CustomToolbar
import com.example.vocabularyapp.featureHome.presentation.addWordScreen.components.WordBlankItem

@Composable
fun AddWordScreen(appNavigation: AppNavigation) {

    Column(modifier = Modifier.fillMaxWidth()) {
        CustomToolbar(text = "New word", onBackClick = {
            appNavigation.navigateBack()
        })

        LazyColumn(modifier = Modifier.padding(horizontal = 12.dp)) {

            item {
                Spacer(modifier = Modifier.height(12.dp))
            }

            items(2) {
                WordBlankItem()

                Spacer(modifier = Modifier.height(8.dp))
            }
            item {
                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(100.dp))
                            .background(Color.Blue)
                    ) {
                        Icon(
                            modifier = Modifier.padding(4.dp),
                            imageVector = Icons.Default.Add,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                }
            }
        }
    }

}