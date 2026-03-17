package com.example.guiapa.ui

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import com.example.guiapa.data.BusinessUiState
import com.example.guiapa.data.LocalBusinessProvider
import com.example.guiapa.model.Business
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BusinessViewModel(application: Application): AndroidViewModel(application){
    private val _uiState = MutableStateFlow(BusinessUiState())
    val uiState: StateFlow<BusinessUiState> = _uiState.asStateFlow()

    init{
        initializeUIState(getApplication())
    }

    private fun initializeUIState(context: Context){
        val allBusiness = LocalBusinessProvider.getBusinessList(context)

        _uiState.update { currentState ->
            currentState.copy(
                business = allBusiness
            )

        }
    }

    fun updateCurrentCategory(category: String){
        _uiState.update { currentState ->
            currentState.copy(
                selectedCategory = category,
                isShowingListPage = true
            )
        }
    }

    fun updateSelectedBusiness(business: Business) {
        _uiState.update { currentState ->
            currentState.copy(
                selectedBusiness = business,
                isShowingListPage = false
            )
        }
    }
}