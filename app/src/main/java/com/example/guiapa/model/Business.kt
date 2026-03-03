package com.example.guiapa.model

data class Business(
    val id: Int,
    val name: String,
    val description: String,
    val address: String,
    val phone: String,
    val website: String,
    val category: Category,
    val imageRes: Int,
    )
{

}