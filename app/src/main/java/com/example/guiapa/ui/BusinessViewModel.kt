package com.example.guiapa.ui

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import com.example.guiapa.data.BusinessUiState
import com.example.guiapa.data.LocalBusinessProvider
import com.example.guiapa.model.Business
import com.example.guiapa.model.Category
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BusinessViewModel(application: Application): AndroidViewModel(application){
    private val _uiState = MutableStateFlow(BusinessUiState())
    val uiState: StateFlow<BusinessUiState> = _uiState.asStateFlow()

    val filteredBusinesses: List<Business>
        get() = if(uiState.value.selectedCategory == null){
            uiState.value.business
        }else{
            filteredBusinesses(uiState.value.selectedCategory!!)
        }

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

    fun updateCurrentCategory(category: Category){
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

    fun filteredBusinesses(category: Category): List<Business>{
        return _uiState.value.business.filter { business ->
            business.category == category
        }

    }

}