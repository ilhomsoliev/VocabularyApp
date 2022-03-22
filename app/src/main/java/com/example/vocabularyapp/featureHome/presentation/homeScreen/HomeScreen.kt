package com.example.vocabularyapp.featureHome.presentation.homeScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.vocabularyapp.app.presentation.navigation.AppNavigation
import com.example.vocabularyapp.featureHome.presentation.components.categoryItem.CategoryItem
import com.example.vocabularyapp.featureHome.presentation.components.categoryToolbar.CategoryToolbar
import com.example.vocabularyapp.featureHome.presentation.components.dialogs.AddCategoryDialog

@Composable
fun HomeScreen(
    appNavigation: AppNavigation,
    viewModel: HomeScreenViewModel = hiltViewModel()
) {

    var isDialogOpen by remember { mutableStateOf(false) }

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    isDialogOpen = true

                    //appNavigation.navigateToAddCategoryScreen()
                }
            ) {
                Icon(Icons.Filled.Add, "")
            }
        }
    ) {

        AddCategoryDialog(
            title = "Add Category",
            isDialogOpen = isDialogOpen,
            onDismissRequest = { isDialogOpen = false },
            onCancelButtonClick = { isDialogOpen = false },
            onSaveButtonClick = {
                isDialogOpen = false
            }
        )

        Column(modifier = Modifier.fillMaxWidth()) {

            CategoryToolbar()
            LazyColumn {
                items(10) {
                    //WordItem()
                    CategoryItem(onClick = {
                        appNavigation.navigateToCategoryDescriptionScreen()
                    })
                }
            }
        }
    }
}