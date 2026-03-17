package com.example.guiapa.data

import com.example.guiapa.model.Business

data class BusinessUiState(
    val business: List<Business> = emptyList(),
    val categories: List<String> = emptyList(),
    val selectedCategory: String? = null,
    val selectedBusiness: Business? = null,
    val isShowingListPage: Boolean = true
)
