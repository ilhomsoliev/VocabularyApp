package com.example.vocabularyapp.featureHome.domain.use_cases

import com.example.vocabularyapp.app.db.category.Category
import com.example.vocabularyapp.core.models.entity.internal.Resource
import com.example.vocabularyapp.featureHome.domain.repository.CategoryRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetCategoriesUseCase @Inject constructor(
    private val repository: CategoryRepository
) {
    operator fun invoke(): Flow<Resource<List<Category>>> = flow {
        try {
            emit(Resource.Loading<List<Category>>())
            val response = repository.getCategories()
            emit(Resource.Success<List<Category>>(response))
        } catch (e: java.lang.Exception) {
            emit(
                Resource.Error<List<Category>>(
                    e.localizedMessage ?: "An unexpected error occured"
                )
            )
        } catch (e: Exception) {
            emit(Resource.Error<List<Category>>("${e.message}"))
        }
    }

}