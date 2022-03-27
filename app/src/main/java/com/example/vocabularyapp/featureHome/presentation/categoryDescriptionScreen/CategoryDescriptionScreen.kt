package com.example.vocabularyapp.featureHome.presentation.categoryDescriptionScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.vocabularyapp.app.presentation.navigation.AppNavigation
import com.example.vocabularyapp.common_ui.components.CustomToolbar
import com.example.vocabularyapp.featureHome.presentation.components.wordItem.WordItem
import com.example.vocabularyapp.featureHome.presentation.components.wordToolbar.WordToolbar

@Composable
fun CategoryDescriptionScreen(
    appNavigation: AppNavigation,
    viewModel: CategoryDescriptionScreenViewModel = hiltViewModel()
) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    appNavigation.navigateToAddWordScreen()
                }
            ) {
                Icon(Icons.Filled.Add, "")
            }
        }
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {

            CustomToolbar(text = "", onBackClick = { /*TODO*/ })
            
            WordToolbar()

            LazyColumn {
                items(10) {
                    //WordItem()
                    WordItem(onClick = {})
                }
            }
        }
    }
}