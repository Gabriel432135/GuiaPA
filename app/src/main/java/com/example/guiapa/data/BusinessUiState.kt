package com.example.guiapa.data

import com.example.guiapa.model.Business
import com.example.guiapa.model.Category

data class BusinessUiState(
    val business: List<Business> = emptyList(),
    val categories: List<String> = emptyList(),
    val selectedCategory: Category? = null,
    val selectedBusiness: Business? = null,
    val isShowingListPage: Boolean = true
)
