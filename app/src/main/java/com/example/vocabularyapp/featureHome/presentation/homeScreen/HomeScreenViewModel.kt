package com.example.vocabularyapp.featureHome.presentation.homeScreen

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.vocabularyapp.app.db.category.Category
import com.example.vocabularyapp.core.models.entity.internal.Resource
import com.example.vocabularyapp.featureHome.domain.use_cases.GetCategoriesUseCase
import com.example.vocabularyapp.featureHome.presentation.states.CategoryState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    private val getCategoriesUseCase: GetCategoriesUseCase
) : ViewModel() {

    private val _stateCategories = mutableStateOf(CategoryState())
    val stateCategories: State<CategoryState> = _stateCategories

    fun getCategories() {
        getCategoriesUseCase().onEach { result: Resource<List<Category>> ->
            when (result) {
                is Resource.Success -> {
                    try {
                        val searchProperties: List<Category>? = result.data
                        _stateCategories.value = CategoryState(response = searchProperties)
                    } catch (e: Exception) {
                        Log.d("Hello", "${e.message} EXEPtion")
                    }
                }
                is Resource.Error -> {
                    _stateCategories.value = CategoryState(
                        error = result.message ?: "An unexpected error accured"
                    )
                }
                is Resource.Loading -> {
                    _stateCategories.value = CategoryState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}